package com.erp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class NexaController implements Controller {
	String requestName = null;
	//EmpLogic empLogic = null;
	Logger logger = Logger.getLogger(NexaController.class);
	
	public NexaController(String requestName) {
		logger.info("EmpController 생성 성공");
		this.requestName=requestName;
		//empLogic = new EmpLogic();

	}
	@Override
	public ModelAndView process(String cud, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		if("empXML".equals(requestName)) {
			logger.info("emp조회 결과 XML 포맷");
		}
		return null;
	}

}
