<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	StringBuilder path = new StringBuilder(request.getContextPath());
	path.append("/");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록[WEB-INF]</title>
<!-- jEasyUI 시작 -->
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>themes/icon.css"> 
<!-- jEasyUI JS 시작 -->
<script type="text/javascript" src="<%=path.toString() %>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path.toString() %>js/jquery.easyui.min.js"></script>
<script>
	function result(){
		  $('#dg_board').datagrid({
		    url: 'jsonGetBoardList.sp4' //서버에서 받을 때 인식할 url
		  });
		}
	function ins(){
		$('#dlg_ins').dialog('open')
	}
</script>   
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#dg_board').datagrid({
				toolbar:"#tb_board2"
			});
		});
	</script>
	<table id="dg_board" class="easyui-datagrid" id="dd" data-options="title:'게시판',toolbar:'#tb_board'" style="width:500px;height:350px">
	    <thead>
	        <tr>
	            <th data-options="field:'BM_NO'">Code</th>
	            <th data-options="field:'BM_TITLE'">Name</th>
	            <th data-options="field:'BM_DATE'">Price</th>
	            <th data-options="field:'BM_FILE'">Price</th>
	            <th data-options="field:'BM_HIT'">Price</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td>001</td><td>name1</td><td>2323</td>
	        </tr>
	        <tr>
	            <td>002</td><td>name2</td><td>4612</td>
	        </tr>
	    </tbody>	
	</table>
	<div id="tb_board2" style="padding:2px 5px;">
	      <a href="javascript:result()" class="easyui-linkbutton" iconCls="icon-search" plain="true">조회</a>
	      <a href="javascript:ins()"  class="easyui-linkbutton" iconCls="icon-add" plain="true">입력</a>
	      <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true">수정</a>
	      <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" plain="true">삭제</a>
	</div>
	<!-- ========================글 쓰기 화면 시작================================== -->
	<div id="dlg_ins" class="easyui-dialog" title="Basic Dialog" data-options="iconCls:'icon-save',closed: false,
       " style="width:600px;height:350px;padding:10px">
        The dialog content.
         <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Email:" labelPosition="top" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="First Name:" labelPosition="top" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Last Name:" labelPosition="top" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Company:" labelPosition="top" style="width:100%;">
        </div>
        
        <div>
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" style="width:100%;height:32px">Register</a>
        </div>
    </div>

	<!-- ========================글 쓰기 화면  끝================================== -->
</body>
</html>