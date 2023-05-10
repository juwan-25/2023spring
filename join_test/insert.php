
<?php
// 사용자 입력 값 테이블 들어가기, insert, mysqli_query
$uid = $_POST['id'];
$upass = $_POST['password'];
$name = $_POST['name'];
$email = $_POST['email'];
$tel = $_POST['tel'];
$local = $_POST['local'];

include("./db_conn.php");
$conn = mysqli_connect($url, $id, $pass, $db, $port);

$sql = "insert into member_join(uid, upass, uname, uemail, utel, ucity) values ('$uid', '$upass', '$name', '$email', '$tel', '$local')";
mysqli_query($conn, $sql);


mysqli_close($conn);

echo "<script>location.href='list.php'</script>";
?>
