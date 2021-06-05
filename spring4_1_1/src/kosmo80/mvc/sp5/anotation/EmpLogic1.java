package kosmo80.mvc.sp5.anotation;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class EmpLogic1 {
	Logger logger = Logger.getLogger(EmpLogic1.class);
	public List<Map<String,Object>> getEmpList() {
		logger.info("getEmpList호출 성공");
		return null;
	}
}
