<?php
    //index에 수정할 번호가 들어감
    $index = $_GET['a'];
?>

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
            margin: 30px;
        }
    </style>

  </head>
  <body>
    <h2>삭제하기</h2>
    <form method="post" action="delete2.php">
      <div class="mb-3 col-sm-3">
        <label for="exampleFormControlInput1" class="form-label">Password Check</label>
        <input type="password" class="form-control" name="passck" id="exampleFormControlInput1" placeholder="password" >
      </div>
        <button type="submit" class="btn btn-dark">삭제</button>  
        <input type="hidden" name="idx" value="<?php echo $index?>"> 
    </form>

  </body>
</html>

