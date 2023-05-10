<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style>
      body {
        margin:30px;
      }
      table, tr, td, th{
        border:none;
      }
      table {
        margin-bottom :20px;
      }
      .divtable {
        padding: 20px;
      }
      .divbtn {
        text-align : right;
      }
      
      </style>
  </head>
  <body>


<?php
//select
include("./db_conn.php");
$conn = mysqli_connect($url, $id, $pass, $db, $port);

$sql2 = "select * from member_join order by id desc";
$result = mysqli_query($conn, $sql2);
$count = mysqli_num_rows($result);

echo "<a href='join.html'><button type='button' class='btn btn-outline-dark'>회원추가</button></a>";
for($i=0; $i<$count; $i++){
    $re = mysqli_fetch_row($result);
    echo "
    <div class='divtable'>
      <table>
        <tbody>
          <tr><th>번호</th><th>$re[0]</th></tr>
          <tr><td>아이디</td><td>$re[1]</td></tr>
          <tr><td>비밀번호</td><td>$re[2]</td></tr>
          <tr><td>이름</td><td>$re[3]</td></tr>
          <tr><td>이메일</td><td>$re[4]</td></tr>
          <tr><td>전화번호</td><td>$re[5]</td></tr>
          <tr><td>지역</td><td>$re[6]</td></tr>
        </tbody>
      </table>
      <div class='divbtn'>
        <a href='modify.php?a=$re[0]'><button type='button' class='btn btn-outline-dark'>수정</button></a>
        <a href='delete.php?a=$re[0]'><button type='button' class='btn btn-outline-dark'>삭제</button></a>
      </div>
    </div>
    <hr>
    ";
  
}

?>

</body>
</html>