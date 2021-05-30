package local.di.anotation;

import org.springframework.stereotype.Component;

//import org.springframework.context.annotation.Scope;

@Component("myCar")
public class Sonata{
   private String carColor = null;
   private int wheelNum = 0;
   private int speed = 0;
   public Sonata() {
	   System.out.println("짜짠~~!");
   }
   public Sonata(String carColor, int wheelNum) {
      this.carColor = carColor;
      this.wheelNum = wheelNum;
   }
   public Sonata(String carColor, int wheelNum, int speed) {
      this.carColor = carColor;
      this.wheelNum = wheelNum;
      this.speed = speed;
   }
   @Override
   public String toString() {
      return "자동차 정보 출력하기";
   }
   public String getCarColor() {
      return carColor;
   }
   public int getWheelNum() {
      return wheelNum;
   }
   public int getSpeed() {
      return speed;
   }
   public void setCarColor(String carColor) {
	   System.out.println("차 색을 결정");
      this.carColor = carColor;
   }
   public void setWheelNum(int wheelNum) {
	   System.out.println("차 번호를 결정");
      this.wheelNum = wheelNum;
   }
   public void setSpeed(int speed) {
	   System.out.println("차 스피드ㄹ를 결정");
      this.speed = speed;
   }

}
