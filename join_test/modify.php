<?php
    include('./db_conn.php');
    $conn = mysqli_connect($url, $id, $pass, $db, $port);

    //index에 수정할 번호가 들어감
    $index = $_GET['a'];

    $sql = "select * from member_join where id='$index'";
    $result = mysqli_query($conn, $sql);
    $count = mysqli_num_rows($result);

    for($i=0; $i<$count; $i++) {
        $re = mysqli_fetch_row($result);
    }
    mysqli_close($conn);
?>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <title>Hello, world!</title>
    <style>
        body {
            margin: 30px;
        }
    </style>
    <script>
      $(function(){
        $("#submit").click(function(){
          if($('#ID').val().length==0) {
            alert("아이디를 입력하세요");
            $('#ID').focus();
            return false;
          }
          if($('#Pass').val().length==0) {
            alert("비밀번호를 입력하세요");
            $('#Pass').focus();
            return false;
          }
          if($('#Name').val().length==0) {
            alert("이름을 입력하세요");
            $('#Name').focus();
            return false;
          }
          if($('#Email').val().length==0) {
            alert("이메일을 입력하세요");
            $('#Email').focus();
            return false;
          }
          if($('#Tel').val().length==0) {
            alert("전화번호를 입력하세요");
            $('#Tel').focus();
            return false;
          }

        })
      })
    </script>

  </head>
  <body>
    <h2>수정하기</h2>
    <form method="post" action="modify2.php">
    <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">ID</label>
        <input type="text" class="form-control" name="id" id="ID" value="<?php echo $re[1]?>" placeholder="id" readonly>
      </div>
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Password</label>
        <input type="password" class="form-control" name="password" id="Pass" placeholder="password">
      </div>
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" class="form-control" name="name" id="Name" value="<?php echo $re[3]?>" placeholder="name" readonly>
      </div>
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Email</label>
        <input type="email" class="form-control" name="email" id="Email" value="<?php echo $re[4]?>" placeholder="email">
      </div>
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Tel</label>
        <input type="tel" class="form-control" name="tel" id="Tel" value="<?php echo $re[5]?>" placeholder="tel">
      </div>
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Local</label>
        <select class="form-select" aria-label="Default select example" name="local" id="Local" value="<?php echo $re[6]?>">
          <option selected value="서울">서울</option>
          <option value="대구">대구</option>
          <option value="인천">인천</option>
          <option value="경기">경기</option>
          <option value="부산">부산</option>
          <option value="제주">제주</option>
        </select>
      </div>
        <button type="submit" class="btn btn-dark">입력완료</button>  
        <input type="hidden" name="idx" value="<?php echo $index?>"> 
    </form>

  </body>
</html>

