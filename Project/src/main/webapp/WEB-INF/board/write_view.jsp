<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
* { padding: 0; margin: 0; }

body {
 font-family: Arial, Helvetica, sans-serif;
 font-size: 13px;
}
#wrapper { 
 margin: 0 auto;
 width: 922px;
}
#faux {
 background: url(faux-3-2-col.gif);
 margin-bottom: 0px;
 overflow: auto; 
 width: 100%
}
#header {
 color: #333;
 width: 902px;
 padding: 10px;
 height: 100px;
 margin: 10px 0px 0px 0px;
 background: #D1DBDB;
}
#navigation {
 color: #333;
 padding: 10px;
 margin: 0px 0px 0px 0px;
 background: #ABBEBE;
}
#leftcolumn { 
 display: inline;
 color: #333;
 margin:10px;
 padding:0;
 width: 195px;
 float: left;
}
#rightcolumn { 
 float: right;
 color: #333;
 margin:10px;
 padding:0;
 width: 683px;
 display: inline;
 position: relative;
}
#footer { 
 width: 902px;
 clear: both;
 color: #333;
 background: #ABBEBE;
 margin: 0px 0px 10px 0px;
 padding: 10px;
}
.clear { clear: both; background: none; }



</style>
<title>write_view</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="./resources/styles.css" />
</head>
<body>

<!-- Begin Wrapper -->
<div id="wrapper">
  <!-- Begin Header -->
  <div id="header"><h1><a href="http://www.free-css.com/free-css-layouts.php">게시판</a></h1></div>
  <!-- End Header -->
  <!-- Begin Navigation -->
  <div id="navigation"> 글쓰기 </div>
  <div id="navigation1"> ? </div>
  <div id="navigation2">/? </div>
 
  <!-- End Navigation -->
  <!-- Begin Faux Columns -->
  <div id="faux">
    <!-- Begin Left Column -->
    <div id="leftcolumn">Left Column</div>
    <!-- End Left Column -->
    <!-- Begin Right Column -->
    <div id="rightcolumn">
      <h1>게시판 글 쓰기</h1>
      <form name="writeform" >
      <table border="0" style="margin: 8px 0; width: 500; cellpadding="0" cellspacing="0">
      <tr>
      <td>작성자:</td>
      <td><input type="text" name="name" size="10"/></td>
      </tr>
      <tr>
      <td>비밀번호:</td>
      <td><input type="password" name="pass" size="10"/></td>
      </tr>
       <tr>
      <td>글 제목:</td>
      <td><input type="text" name="title" size="30"/></td>
      </tr>
       <tr>
      <td>글 내용:</td>
      <td><textarea rows="10" cols="40" name="content"></textarea></td>
      </tr>
       <tr>
      <td>파일첨부</td>
      <td><input type="text" name="ofile"/>
      <button></button>
      </td>
      </tr>
      <tr>
      <td colspan="10">
      <button type="button" onclick="checkform();">작성완료</button>
      </td>
      </tr>
      
      </table>
      
    
    </form><%--form태그 끝 --%>
    
    
    
      <ul style="margin:0 0 15px 0; padding:0; list-style-type:none;">
       
       
       
        <li style="margin-right:15px; display:inline;"><a href="#">Free CSS Templates</a></li>
        <li style="margin-right:15px; display:inline;"><a href="#">Free CSS Layouts</a></li>
        <li style="margin-right:15px; display:inline;"><a href="#">Code Sucks</a></li>
      </ul>
      <div class="clear"> </div>
    </div>
    <!-- End Right Column -->
    <div class="clear"> </div>
  </div>
  <!-- End Faux Columns -->
  <!-- Begin Footer -->
  <div id="footer"> This is the Footer </div>
  <!-- End Footer -->
 </div>
<!-- End Wrapper -->
<script>

function checkform() {
	alert('aaa'); 
	var form = document.writeform;
	if(form.name.value ==""){
		alert("이름을 입력하세요");
		form.name.focus();
		return.false;
	}
	
}


</script>


</body>
</html>
