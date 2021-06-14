<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge" >
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" >
	<meta name="viewport" content="user-scalable=1, initial-scale=0.1, width=device-width, target-densitydpi=device-dpi" >
<%@ include file="header.jsp" %>
	<title>SI를 위한 경량 ERP솔루션</title>
</head>
<body style="margin:0;border:none;-ms-touch-action:none;" onload="oninitframework()">
	<script>
		function oninitframework()
		{
			var screeninfo = [
            {"id":"Desktop_screen","type":"desktop","themeid":"theme::default","xadl":"Application_Desktop.xadl.js"}
			];

			nexacro._initHTMLSysEvent(window, document);			
			nexacro._initEnvironment(screeninfo);
            nexacro._prepareManagerFrame(onloadframework);
		}
		function onloadframework()
		{
			nexacro._loadADL();
		}
		function onfinalframework()
		{
			
		}
	</script>
</body>
</html>
