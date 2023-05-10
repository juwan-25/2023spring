<?php
  $idx = $_POST['idx'];
  
  $uid = $_POST['id'];
  $upass = $_POST['password'];
  $name = $_POST['name'];
  $email = $_POST['email'];
  $tel = $_POST['tel'];
  $local = $_POST['local'];

  include('./db_conn.php');
  $conn = mysqli_connect($url, $id, $pass, $db, $port);
  $sql = "select * from member_join where id='$idx';";
  $result = mysqli_query($conn, $sql);
  $count = mysqli_num_rows($result);

  for($i=0; $i<$count; $i++){
      $re = mysqli_fetch_row($result);
  }

  if($re[2]!=$upass){
    echo "<script>alert('비밀번호 오류');</script>";
    echo "<script>history.back();</script>";
  } else {
    $sql2 = "update member_join set uid='$uid', upass='$upass', uname='$name', uemail='$email', utel='$tel', ucity='$local' where id='$idx';";
    mysqli_query($conn, $sql2);
    echo "<script>alert('수정 완료');</script>";
    echo "<script>location.replace('./list.php');</script>"; 
  }
  
  mysqli_close($conn);

?>








