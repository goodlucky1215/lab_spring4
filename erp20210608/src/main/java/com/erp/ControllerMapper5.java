package com.erp;

import org.apache.log4j.Logger;

public class ControllerMapper5 {
	static Logger logger = Logger.getLogger(ControllerMapper5.class);
	
//	static Controller controller = null;
	public static Controller getController(String command) {
		Controller controller = null;
		String commands[] = command.split("/"); 
			
			if(commands.length==2) { 
				String work = commands[0];
				String requestName = commands[1];
				logger.info("work ==>"+work   );
				logger.info("requestName ==>"+requestName);
				if("emp".equals(work)) {
					//로그인 컨트롤러
					controller = new EmpController(requestName);
				}else if("nexa".equals(work)) {
					//넥사크로 전담 처리 
					controller = new NexaController(requestName);
				}
			}
		return controller;
	}//////end of getController
}
