<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 구현 - webapp</title>
<!-- WEBCONTENT는 dynamic프로젝트에서 임의로 만들어진 이름이다. -->
<jsp:include page="../common/commonUIglobal.jsp" flush="false" />
</head>
<body>
	<table class="easyui-datagrid" style="width:600px;height:500px"
	        data-options="title:'게시판',toolbar:'#tb_board'">
	    <thead>
	        <tr>
	            <th data-options="field:'code',width:100">Code</th>
	            <th data-options="field:'name',width:100">Name</th>
	            <th data-options="field:'price',width:100,align:'right'">Price</th>
	            <th data-options="field:'price',width:100,align:'right'">Price</th>
	            <th data-options="field:'price',width:100,align:'right'">Price</th>
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
	 <div id="tb_board" style="padding:2px 5px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true">조회</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true">입력</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-pensil" plain="true">수정</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" plain="true">삭제</a>
    </div>
</body>
</html>