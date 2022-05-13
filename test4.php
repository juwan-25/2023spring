<?php
$arr = array();
$arr[0] = "apple";
$arr[1] = "banana";
$arr[2] = "melon";

//for($i = 0; $i<3; $i++)
//echo $arr[$i]." ";

foreach($arr as $element){
    echo $element." ";
}

echo "<br>\n";

$arr2 = array("mango","grape","peach");

for($i = 0; $i<3; $i++)
echo $arr2[$i]." ";

echo "<br>\n";

?>

<?php
$arr3 = array("apple" => 1000, "mango"=> 2000, "grape"=>3000);

echo $arr3["apple"]." ".$arr3["mango"]." ".$arr3["grape"];

echo "<br>\n";

foreach($arr3 as $key => $value){
    echo $key." ".$value." ";
}

?>