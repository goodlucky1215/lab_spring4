package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;



public class Board41MDao {
	Logger logger = Logger.getLogger(Board41MDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<Map<String, Object>> getBoardList(Map<String, Object> pmap) {
		List<Map<String,Object>> boardList = null;
		boardList = sqlSessionTemplate.selectList("getBoardList",pmap);
		return boardList;
	}
	public int boardMInsert(Map<String, Object> pmap) {
		logger.info("boardMInsert 호출 성공 : "+pmap);
		int result = 0;
		result = 1;
		sqlSessionTemplate.insert("boardInsert",pmap);
		return result;
	}
	public void bmStepUpdate(Map<String, Object> pmap) {
		logger.info("bmStepUpdate 호출 성공");
		sqlSessionTemplate.update("bmStepUpdate",pmap);		
	}
	public void hitCount(int bm_no) {
		logger.info("hitCount 호출 성공");
		sqlSessionTemplate.update("hitCount",bm_no);		
	}
	public int getBmGroup() {
		logger.info("getBmGroup 호출 성공");
		int result = 0;
		result = sqlSessionTemplate.selectOne("getBmGroup");		
		return result;
	}
	public int getBmNo() {
		logger.info("getBmNo 호출 성공");
		int result = 0;
		result = sqlSessionTemplate.selectOne("getBmNo");		
		return result;
	}
}
