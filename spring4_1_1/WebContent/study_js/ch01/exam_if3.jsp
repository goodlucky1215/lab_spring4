<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/commonUIglobal.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <script type="text/javascript">
  	function test(){
  	  	if(1===1){
          //다 같은 의미임
  	      document.write("같다잉~ <br>");
  	      document.write("같다잉~","<br>");
  	      document.write("같다잉~"+"<br>");
  	    }
  	    else{
  	      document.write("틀린게 아니고 다르다잉~~~");
  	    }
  	}
  </script>
</head>
<body>
 가나다라마바사
  <script type="text/javascript">
 	test();
  </script>
  아야여어오요
</body>
</html>