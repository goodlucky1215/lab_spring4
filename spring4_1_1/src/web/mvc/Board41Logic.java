package web.mvc;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class Board41Logic {
	Logger logger = Logger.getLogger(Board41Logic.class);
	private Board41MDao boardMDao = null;
	public void setBoardMDao(Board41MDao boardMDao) {
		this.boardMDao = boardMDao;
	}
	private Board41SDao boardSDao = null;
	public void setBoardSDao(Board41SDao boardSDao) {
		this.boardSDao = boardSDao;
	}
	public List<Map<String, Object>> getBoardList(Map<String, Object> pmap) {
		logger.info("getBoardList 호출 성공");
		List<Map<String, Object>> boardList = null;
		boardList = boardMDao.getBoardList(pmap);
		return boardList;

	}
	public int boardInsert(Map<String, Object> pmap) {
		logger.info("getBoardList 호출 성공이요!!");
		int result = 0;
		int bm_no = 0;
		int bm_group = 0;
		if(pmap.get("bm_group")!=null) {
			bm_group = Integer.parseInt(pmap.get("bm_group").toString());
		}
		//댓글이야?
		if(bm_group>0) {	
			boardMDao.bmStepUpdate(pmap);
			pmap.put("bm_pos", Integer.parseInt(pmap.get("bm_pos").toString())+1);
			pmap.put("bm_step", Integer.parseInt(pmap.get("bm_step").toString())+1);
		}
		//새글이야?
		else {
			bm_group = boardMDao.getBmGroup();
			pmap.put("bm_group", bm_group);
			pmap.put("bm_pos",0);
			pmap.put("bm_step",0);
		}
		//첨부파일 있어?
		if((pmap.get("bm_pos")!=null)&(pmap.get("bm_pos").toString().length()>0)) {
			pmap.put("bm_no",bm_no);
			pmap.put("bm_seq",1);
			boardSDao.boardSInsert(pmap);
		}
		boardMDao.boardMInsert(pmap);
		//첨부파일이 있어?
		if(pmap.containsKey("bs_file")) {
			boardSDao.boardSInsert(pmap);
			System.out.println("들어갔니? "+result);
		}
		return 1;
	}
}
