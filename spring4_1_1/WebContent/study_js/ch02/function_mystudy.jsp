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
  
  	function show(masege="hey",from){  		
      document.write(masege,"<br>");
      document.write(from,"<br>");
      document.write("------------------------","<br>");
  	};
  	
  	const result = function(){  	
  		masege="hello";
  		from="나야나"
        document.write(masege,"<br>");
        document.write(from,"<br>");
        document.write("------------------------","<br>");
    };

  	 (function re(){  	
   		masege="나는 바로 실행되지!!";
   		from="하지만 re()으로 나를 사용하지는 못해"
         document.write(masege,"<br>");
         document.write(from,"<br>");
         document.write("------------------------","<br>");
     })();
   	
  	const end = () => {  	
  		masege="안녕";
  		from="지혜야"
        document.write(masege,"<br>");
        document.write(from,"<br>");
        document.write("------------------------","<br>");
    };

  	show();
	result();
	end();
  </script>
</body>
</html>