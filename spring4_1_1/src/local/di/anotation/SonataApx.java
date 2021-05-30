package local.di.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {
	public static void main(String[] args) {
		//Sonata herCar = new Sonata(); //라이프 사이클 관리를 직접해야한다. => 인스턴스화 (우리는 이거를 직접 관리 안 시키려고!)
		ApplicationContext context =
				new ClassPathXmlApplicationContext("local\\di2\\sonataBean.xml");
		/*
		 * Sonata myCar = null; //처음에는 null로 관리를 해야 모범 답안 myCar =
		 * (Sonata)context.getBean("myCar"); System.out.println(myCar.toString());
		 * System.out.println("my의 현재 속도"+myCar.getWheelNum());
		 */
	}
}
