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
		logger.info("boardMInsert 출력 성공");
		int result = -1;
		pmap.put("bm_no",sqlSessionTemplate.selectOne("getBmNo"));
		pmap.put("bm_group",sqlSessionTemplate.selectOne("getBmGroup"));
		result = sqlSessionTemplate.insert("boardInsert",pmap);
		logger.info("boardMInsert 출력 성공");
		logger.info("boa"+pmap);
		return result;
	}
}
