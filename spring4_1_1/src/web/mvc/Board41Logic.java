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
		int fileOk = 0;
		result = boardMDao.boardMInsert(pmap);
		//첨부파일이 있어?
		if(pmap.containsKey("bs_file")) {
			fileOk = boardSDao.boardSInsert(pmap);
			System.out.println("들어갔니? "+result);
			System.out.println("들어갔니? "+fileOk);
		}
		return 1;
	}
}
