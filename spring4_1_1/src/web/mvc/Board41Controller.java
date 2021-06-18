package web.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.util.HashMapBinder;

public class Board41Controller extends MultiActionController {
	/*
	 * <bean id="board-controller">
	 *  <property name="boardLogic">
	 * 로 써야 사용이 된다.
	 */
	private Board41Logic boardLogic = null;
	//setter메소드를 통하여 게으른 객체 주입
	public void setBoardLogic(Board41Logic boardLogic) {
		logger.info("setBoardLogic 호출 성공");
		this.boardLogic = boardLogic;
	}
	//request로 유지 -> 이렇게 하면 스프링으로 하는거라고?!
	//메소드를 정의하는 것은 가능하다.
	//파라미터가 없어도  괜찮은건가?(== req, res가 없어도 괜찮은건가?)
	//파라미터에 req나 res가 없으면 아무리 xml 문서에 url매핑을 해두었다고 해도 찾지를 못합니다.
	//이 사실만 보더라도 의존적이다라고 할 수 있지 않을까?
	//최초 나는 ModelAndView를 사용했다. 이것은 MultiActionController를 상속받았을때
	//우리는 doGet에서는 누릴 수 없었던 반환타입을 누리게 된 것이죠
	//ModelAndView의 scope를 request로 한 이유도 생각해보자
	//이 생각 끝에는 forward로 페이지를 부른다는 사실을 인지하게 된다.
	//ModelAndView가 있는데 굳이 파라미터 req,res가 있어야만 한다 그렇지 않으면
	//매핑 해주지 않는다는 것은 앞뒤가 맞지가 않는다
	//굳이 없어도 되는 것을 왜 형식적으로 가져야하나
	//doGet안에 있는 것이니깐 너도 있어야 해줄거야.라고 말하는 것이다.
	public ModelAndView getBoardList(HttpServletRequest req, HttpServletResponse res)
	throws Exception {
	      logger.info("getBoardList 호출성공");
	      HashMapBinder hmb = new HashMapBinder(req);
	      Map<String,Object> target = new HashMap();
	      target.put("gubun","");
	      hmb.bind(target);
	      List<Map<String,Object>> boardList = null;
	      boardList = boardLogic.getBoardList(target);
	      logger.info("boardList : "+boardList);
	      ModelAndView mav = new ModelAndView();
	      mav.setViewName("board/getBoardList");//forward니깐 url은 그대로 있는데 jsp는 나온다니깐
	      //톰캣이 요청은 유지되고 있습니다.라고 판단을 한다.
	      mav.addObject("boardList", boardList);
//	      RequestDispatcher view = req.getRequestDispatcher("getBoardList.jsp");
//	      view.forward(req, res);
	      return mav;
	}
	public ModelAndView getBoardDetail(HttpServletRequest req, HttpServletResponse res)
	throws Exception {
	      logger.info("getBoardDetail 호출성공");
	      HashMapBinder hmb = new HashMapBinder(req);
	      Map<String,Object> target = new HashMap();
	      hmb.bind(target);//bm_no 담음.
	      target.put("gubun","detail");
	      logger.info("bm_no : "+target.get("bm_no"));
	      List<Map<String,Object>> boardDetail = null;
	      boardDetail = boardLogic.getBoardList(target);
	      ModelAndView mav = new ModelAndView();
	      mav.setViewName("board/read");//forward니깐 url은 그대로 있는데 jsp는 나온다니깐
	      //톰캣이 요청은 유지되고 있습니다.라고 판단을 한다.
	      mav.addObject("boardDetail", boardDetail);
//	      RequestDispatcher view = req.getRequestDispatcher("getBoardList.jsp");
//	      view.forward(req, res);
	      return mav;
	}
	//json으로 내보내준다. - @RestController : String, @Controller : void, ModelAndView, String
	//@RestController 얘쓰면 req이런거 없이 가뿐하게 해결 됨.
	public void jsonGetBoardList(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    logger.info("getBoardList 호출성공");
	    HashMapBinder hmb = new HashMapBinder(req);
	    Map<String,Object> target = new HashMap();
	    hmb.bind(target);
	    List<Map<String,Object>> boardList = null;
	    boardList = boardLogic.getBoardList(target);
	    logger.info("boardList : "+boardList);
		Gson g = new Gson();
		String imsi = g.toJson(boardList);
		res.setContentType("application/json;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print(imsi);
	}
	public void boardInsert(HttpServletRequest req, HttpServletResponse res) throws IOException{
		HashMapBinder hmb = new HashMapBinder(req); //bm_title=제목이야&bm_writer=지니  => 쿼리스트링을 담음.
		Map<String,Object> pmap = new HashMap<>();
		hmb.multiBind(pmap);
		//http://localhost:8000/board/boardInsert.sp4?bm_title=와우와우껌&bs_file=A.txt&bm_writer=지니&bm_email=test@hot.com&bm_content=내용이당&bm_pw=123
		//사용자가 입력한 값이나 서버에서 클라이언트에게 요청한 값 넘김.
		int result = 0;
		result = boardLogic.boardInsert(pmap);
		if(result==1) {
			res.sendRedirect("./getBoardList.sp4");
		}
		else {
			res.sendRedirect("./boardinsertFail.jsp");
		}
	
	}
	public ModelAndView updateForm(HttpServletRequest req, HttpServletResponse res) {
		HashMapBinder hmb = new HashMapBinder(req); 
		Map<String,Object> pmap = new HashMap<>();
		hmb.bind(pmap);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/updateForm");
		mav.addObject("target",pmap);
		return mav;
	}
	public void boardUpdate(HttpServletRequest req, HttpServletResponse res) throws IOException{
		logger.info("업데이트 성공");
		HashMapBinder hmb = new HashMapBinder(req); //bm_title=제목이야&bm_writer=지니  => 쿼리스트링을 담음.
		Map<String,Object> pmap = new HashMap<>();
		hmb.bindPost(pmap);
		//http://localhost:8000/board/boardInsert.sp4?bm_title=와우와우껌&bs_file=A.txt&bm_writer=지니&bm_email=test@hot.com&bm_content=내용이당&bm_pw=123
		//사용자가 입력한 값이나 서버에서 클라이언트에게 요청한 값 넘김.
		int result = 0;
		result = boardLogic.boardUpdate(pmap);
		if(result==1) {
			res.sendRedirect("./getBoardList.sp4");
		}
		else {
			res.sendRedirect("./boardinsertFail.jsp");
		}
	}
	public void boardDelete(HttpServletRequest req, HttpServletResponse res) throws IOException{
		logger.info("boardDelete 성공");
		HashMapBinder hmb = new HashMapBinder(req); //bm_title=제목이야&bm_writer=지니  => 쿼리스트링을 담음.
		Map<String,Object> pmap = new HashMap<>();
		hmb.bindPost(pmap);
		int result = 0;
		result = boardLogic.boardDelete(pmap);
		if(result==1) {
			res.sendRedirect("./getBoardList.sp4");
		}
		else {
			res.sendRedirect("./boardinsertFail.jsp");
		}
	}
}
