<?php
    $idx = $_POST['idx'];
    $ckPass = $_POST['passck'];

    include('./db_conn.php');
    $conn = mysqli_connect($url, $id, $pass, $db, $port);
    $sql = "select * from member_join where id='$idx';";
    $result = mysqli_query($conn, $sql);
    $count = mysqli_num_rows($result);

    for($i=0; $i<$count; $i++){
        $re = mysqli_fetch_row($result);
    }

    if($re[2]!=$ckPass){
        echo "<script>alert('비밀번호 오류');</script>";
        echo "<script>history.back();</script>";
    } else {
        $sql2 = "delete from member_join where id='$idx';";
        mysqli_query($conn, $sql2);
        echo "<script>alert('삭제 완료');</script>";
        echo "<script>location.replace('./list.php');</script>"; 
    }
    
    mysqli_close($conn);

?>