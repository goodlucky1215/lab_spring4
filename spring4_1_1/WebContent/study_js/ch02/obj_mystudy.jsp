<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <script type="text/javascript">
      class Mycolor{
        constructor(color){
          this.color = color;
        }
        draw(){
          alert("나의 색깔은",this.color);
        }
      };
      class usercolor extends Mycolor{};
      const user1 = new usercolor('red'); 
      user1.draw();
    class person{
      constructor(firstName, lastName,age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
      }
      get age(){
        return this._age;
      }
      set age(value){
        this._age = value < 0 ? value:-1;
      }
    };
    const user = new person("lee","he",-2);
    console.log(user.age);
  </script>
</body>
</html>