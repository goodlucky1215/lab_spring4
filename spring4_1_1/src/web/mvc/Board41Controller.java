package web.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

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
		logger.info("getBoardList 호출 성공");
		HashMapBinder hmb = new HashMapBinder(req);
		Map<String, Object> target = new HashMap();
		hmb.bind(target);
		boardLogic.getBoardList(target); //where bm_no=? and bm_title LIKE '%'||?||'%'
		ModelAndView mav = new ModelAndView();
		//RequestDispatcher view = req.getRequestDispatcher("getBoardList.jsp");
		//view.forward(req, res);
		return mav;
	}
	//json으로 내보내준다. - @RestController : String, @Controller : void, ModelAndView, String
	public void jsonGetBoardList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("jsonGetBoardList 호출 성공");
	}
}
