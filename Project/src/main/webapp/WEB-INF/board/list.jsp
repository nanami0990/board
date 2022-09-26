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
<title>Faux Column CSS Layouts - 2 Column - faux-5-2-col</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="./resources/styles.css" />
</head>
<body>
<!-- Begin Wrapper -->
<div id="wrapper">
  <!-- Begin Header -->
  <div id="header"><h1><a href="http://www.free-css.com/free-css-layouts.php">Free CSS Layouts</a></h1></div>
  <!-- End Header -->
  <!-- Begin Navigation -->
  <div id="navigation"> Navigation Here </div>
  <!-- End Navigation -->
  <!-- Begin Faux Columns -->
  <div id="faux">
    <!-- Begin Left Column -->
    <div id="leftcolumn">Left Column</div>
    <!-- End Left Column -->
    <!-- Begin Right Column -->
    <div id="rightcolumn">
      <h1>Faux Column CSS Layouts</h1>
      <p>These 2 Column Faux CSS Layouts use a background image to make it look like the left and right columns are equal in height and independent of each other.</p>
      <p style="margin:8px 0;">Etsemper tristiquat orci ligula ligula vitae netus justo tellus nulla elit. Temporid interdum partur gravida justo nequam sem fuscing malesuada vitae lacus. Pellentesquenunc non tincidunt lacilis donec vel purus maecenatis eu sed urna. Ideu justo hac eros sed eros mattitor quis vestibus magnisl nisl. Nullanequam egestas facilisi orci sodales ut ac molesuada interdum tincidunt scetus.</p>
      <p style="margin:8px 0;">Semnibh sed anterdum et laorem nunc tempus temper malesuada sem consectetuer. Enimhabitae nec egest eu auctorttis in leo dui semportis ris enim. Maurissemportor commod vestibulum feugiat auctor alique nullamcorper ligula convallicitur justo orna. Sedid ut elit vestibulum sed curabitur platea justo dissim ultris sed. Sagittisquisque quisque leo dui met tellus curabitur auctor et quat loreet.</p>
      <p style="margin:8px 0;">Nullaet ligula ut ant elit sed condiment elit quis urna laoreet. Fringpor aliquam justo dui nec morbi sed diculis ipsum elit temportis. Ultrisiacus ut curabitae orci nulla curabitur leo nunc lor sapien ligula. Diamquis sagittitor quat vitae leo ipsum id vivamus sodalesuada por gravida. Sedet rutrum pellus tellus vel nonummy tincidunt urna purus malestibulum adipis.</p>
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
</body>
</html>
