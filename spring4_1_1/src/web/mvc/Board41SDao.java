package web.mvc;

import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

public class Board41SDao {
	Logger logger = Logger.getLogger(Board41SDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public int boardSInsert(Map<String, Object> pmap) {
		logger.info("boardSInsert 출력 성공");
		int fileResult = -1;
		int bs_seq = 0;
		//사이즈 임의로 0줌
		bs_seq = sqlSessionTemplate.selectOne("getBsseq");
		pmap.put("bs_seq",bs_seq);
		fileResult = sqlSessionTemplate.insert("boardFileInsert",pmap);
		
		return fileResult;
	}
}
