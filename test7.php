<?php
    $dir=opendir(".."); //현재 디렉토리 열기
    while($files=readdir($dir)){
        echo $files."<br>";
    }
    closedir($dir);
?>

<?php
    $dir=opendir("C:\Bitnami\wampstack-8.1.4-0\apache2"); 
    while($files=readdir($dir)){
        echo $files."<br>";
    }
    closedir($dir);
?>

<!--is_dir(디렉) : 디렉토리가 있는지 없는지
file_exists(디렉) : 파일이 있는지 없는지-->
<?php
    $dir="./data";
    if(is_dir($dir)) echo "있음<br>";
    else echo "없음<br>";
?>

<?php
    $dir="./";
    if(file_exists($dir)) echo "있음<br>";
    else echo "없음<br>";
?>

