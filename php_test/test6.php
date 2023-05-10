<?php
    $str1="Hello php";
    $str2="Hello PHP";

    if(strcmp($str1,$str2)==0) echo "다르다<br>";
    else echo "같다<br>";

?>

<!--strtolower(문자열) 소문자-->
<!--strtoupper(문자열) 대문자-->
<?php
    $str3 = "Marry Had A little lamb and She LOVED It So MUch";
    //대문자
    echo  strtolower($str3)."<br>";
    echo  strtoupper($str3)."<br>";
?>

<!-- explode(구분 기준 문자열, 구분할 문자열)-->
<?php 
    $pizza = "piece1 piece2 piece3 piece4 piece5 piece6";
    $arr = explode(" ",$pizza);
    
    var_dump($arr);
    echo "<br>";

    foreach($arr as $i)
        echo $i;
    echo "<br>";
?>

<!-- implode(구분 기준 문자열, 배열)-->
<?php 
    $arr = array("piece1","piece2","piece3");
    echo implode(" | ",$arr)."<br>";
?>

<!-- str_replace(바꿀 문자열, 바뀌는 문자열, 대상문자열)-->
<?php
    $str = "Marry should study hard";
    echo str_replace("should","could",$str)."<br>";
?>