'use strict'

class Mycolor{
  constructor(color){
    this.color = color;
  }
  draw(){
    console.log("나의 색깔은",this.color)
    alert("나의 색깔은",this.color);
  }
};
class usercolor extends Mycolor{};
const user1 = new usercolor('red'); 
user1.draw();
console.log(user1.draw());