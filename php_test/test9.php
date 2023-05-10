<?php
    //파일 열고 출력하기
    $filename = "read.txt";
    $fp = fopen($filename, "r");

    //fgetc, fgets, file_get_contents, fread
    while($s=fgets($fp)){
        echo $s."<br>";
    }

    fclose($fp);

    echo "<br>";
?>

<?php
    //파일 저장하기
    $fp = fopen("write.txt", "w");

    $str = "Marry has a dog";

    //fwrite($fp, $str);
    file_put_contents("write2.txt",$str);

    fclose($fp);

    echo "저장";
?>