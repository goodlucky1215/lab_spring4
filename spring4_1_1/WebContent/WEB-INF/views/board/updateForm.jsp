<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	StringBuilder path = new StringBuilder(request.getContextPath());
	path.append("/");
	String bm_no = request.getParameter("BM_NO");
	String bs_file = request.getParameter("BS_FILE");
	String bm_writer = request.getParameter("BM_WRITER");
	String bm_content = request.getParameter("BM_CONTENT");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/icon.css"> 
<!-- jEasyUI JS 시작 -->
<script type="text/javascript" src="<%=path.toString() %>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path.toString() %>js/jquery.easyui.min.js"></script> 
<script type="text/javascript">
function updAction(){
    console.log("입력액션 호출");
    $('#board_upd').submit();
}	
</script>
</head>
<body>
	<!-- ------------------------------------------------글 수정 -------------- -->   
	   
       <form id="board_upd" method="post"  action="boardUpdate.sp4">
       <input type="hidden" name="bm_no" value="<%=bm_no%>">
       <input type="hidden" name="bs_file" value="<%=bs_file%>">
       <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="bm_title" label="제목:" labelPosition="top" data-options="prompt:'제목'" style="width:400px;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="bm_writer" label="작성자:" labelPosition="top" data-options="prompt:'작성자'" style="width:250px;">
        </div>        
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="bm_content" label="내용:" labelPosition="top" data-options="prompt:'내용',multiline:true, width:500, height:120">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="bm_email" label="Email:" labelPosition="top" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="bm_pw" label="비밀번호:" labelPosition="top" style="width:200;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-filebox" name="bs_file" label="첨부파일:" labelPosition="top" data-options="width:'400px'" >
        </div>
       </form>
    </div>
    <div id="ft_ins">
      <a href="javascript:updAction()" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true">수정</a>
      <a href='javascript:$("#dlg_upd").dialog("class");' class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true">닫기</a>
   </div>
	<!-- -------------------------------------------------------------------- -->
	
</body>
</html>