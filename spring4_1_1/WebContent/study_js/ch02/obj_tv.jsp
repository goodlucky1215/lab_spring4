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
    let tv = new Object();
    tv.color = "black";
    tv.price = 300000;
    tv.info = function(){
      document.write("색상 :"+tv.color,"<br>" );
      document.write("가격 :"+tv.price,"<br>" );
    }
    tv.info();
    const today = new Date();
    const mon = today.getMonth();
    const date = today.getDate();
    const day = today.getDay();
    const worldCup = new Date(2020,4,30);
    const mon = worldCup.getMonth();
    const date = worldCup.getDate();
    const day = worldCup.getDay();
  </script>
</body>
</html>