<?php
    $fp = fopen("count.txt","r");
    $num = fgets($fp);
    $count = (int)$num;

    $count+=1;

    fclose($fp);

    $fp = fopen("count.txt","w");
    fwrite($fp,$count);


    fclose($fp);
  
?>

<h1> 당신은 <?php echo $count ?>번째 방문자 입니다.</h1>