<?php
    $filename = "data.txt";
    $fp=fopen($filename,"r");

    while($c=fgetc($fp)){
        echo $c;
    }

    fclose($fp);
    echo "<br>";
?>

<?php
    $filename = "data.txt";
    $fp=fopen($filename,"r");

    while($s=fgets($fp)){
        echo $s."<br>";
    }

    fclose($fp);
?>

<?php
    $filename = "data.txt";
    $s=file_get_contents($filename);

    echo $s;
?>