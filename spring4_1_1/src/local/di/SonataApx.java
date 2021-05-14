package local.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {
	public static void main(String[] args) {
		Sonata herCar = new Sonata(); //라이프 사이클 관리를 직접해야한다. => 인스턴스화 (우리는 이거를 직접 관리 안 시키려고!)
		ApplicationContext context =
				new ClassPathXmlApplicationContext("local\\di\\sonataBean.xml");
		Sonata myCar = null; //처음에는 null로 관리를 해야 모범 답안
		myCar = (Sonata)context.getBean("myCar");
		System.out.println(myCar.toString());
		System.out.println("my의 현재 속도"+myCar.getSpeed());
		Sonata yourCar = null;
		yourCar = (Sonata)context.getBean("yourCar");
		System.out.println(yourCar.toString());
		System.out.println("you의 현재 속도"+yourCar.getSpeed());
		Sonata meCar = null;
		//여기서부터 터짐 forward가  없으니깐!!
		meCar = (Sonata)context.getBean("meCar");
		System.out.println(meCar.toString());
		System.out.println("me의 현재 속도"+meCar.getSpeed());
		Sonata himCar = null;
		himCar = (Sonata)context.getBean("himCar");
		System.out.println(himCar.toString());
		System.out.println("him의 현재 속도"+yourCar.getSpeed());
	}
}
