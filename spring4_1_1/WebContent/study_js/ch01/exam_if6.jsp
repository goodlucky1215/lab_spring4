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
      let question = prompt("당신이 가장 많이 이용하는 포털 사이트는?");
      let url;  
  	  	if(question==="구글"){
          document.write("그렇구만!!");
  	    }
  	    else if(question==="네이버"){
  	      document.write("윽 네이버...고객센터도 없는 네이버야..");
  	    }
  	    else if(question==="다음"){
  	      document.write("올 다음분~");
  	    }
        else{
          document.write("해당 사항은 없다.");
        }
        console.log(url);
  	}
    function test2(){
      let question = prompt("당신이 가장 많이 이용하는 포털 사이트는?");
      let url;  
      switch (question) {
            case "구글":
              url="www.google.com";
              break;
            case "네이버":
              url="www.naver.com/";
              break;
            case "다음":
                url="www.daum.net/";
              break;
            default:
              document.write("해당 사항은 없다."); 
        }
      if(url) location.href="http://"+url;
  	}
  </script>
</head>
<body>
  <script type="text/javascript">
 	test2();
  </script>
</body>
</html>