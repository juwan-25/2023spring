<?php


function add(){
    echo 10+20+30;
}

function add1($a,$b,$c){
    echo $a+$b+$c;
}

function add2(){
    return 10+20+30;
}

function add3($a,$b,$c){
    return $a+$b+$c;
}

add();
echo "<br>\n";

add1(10,20,30);
echo "<br>\n";

echo add2();
echo "<br>\n";

echo add3(10,20,30);
echo "<br>\n";
?>
