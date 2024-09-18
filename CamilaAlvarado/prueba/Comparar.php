<?php
if($_POST){
    $Num01 = $_POST['txtNum01'];
    $Num02 = $_POST['txtNum02'];

    if($Num01 == $Num02){
        echo "Son Exactamente Iguales";
    
        }else if($Num01<$Num02){
            echo "El numero Mayor es: ".$Num02;
        }else if($Num01>$Num02){
            echo "El numero Menor es: ".$Num02;
        }
}
?>