<?php
    $score = 78;
    if($score > 90)
        echo "A";
    else if($score > 80)
        echo "B";
    else if($score > 70)
        echo "C";
    else if($score > 60)
        echo "D";
    else if($score > 50)
        echo "E";
    else echo"F";

    switch($score){
        case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91:
            echo "A";
            break;
        case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: 
    }

?>
