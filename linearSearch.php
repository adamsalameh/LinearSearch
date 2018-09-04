<?php //php 7.0.8

function linearSearch($array, $num){
    
    $length = count($array);
    for ($i = 0; $i < count($array); $i++){
        if ($num == $array[$i]){
           return $i; 
        }
        
    }
    return -1;
}

 $numbers = array(10, 50, 60, 70, 80, 500, 1000, 55, 99, 90);
 echo (linearSearch($numbers, 99));
    
?>
