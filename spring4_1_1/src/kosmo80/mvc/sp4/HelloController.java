package kosmo80.mvc.sp4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sun.istack.internal.logging.Logger;



public class HelloController extends AbstractController {
	Logger logger = Logger.getLogger(HelloController.class);
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("handlerRequestInternal 호출 성공");
		// TODO Auto-generated method stub
		return null;
	}

}
