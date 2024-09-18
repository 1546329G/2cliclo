<?php
if($_POST){


    //Recibi Informacion del Formulario HTML metodo POST

    $saldo   = $_POST['txtSaldo'];

    $apuesta   = $_POST['txtApuesta'];
    $cartas = array();

    $simbolo=array("Espadas", "Corazones", "Diamantes", "Treboles");

    $numero=array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,30);


    echo 'Su saldo es '.$saldo.'<br>';

    echo 'Su apuesta es '.$apuesta.'<br>';+

    foreach ($simbolo as $suit) S<{

        foreach ($numero as $rank) {

            $cartas[] = $rank . " de " . $suit;

        }

    }

   

    // Ahora, $cartas contiene todas las cartas combinadas

    foreach ($cartas as $carta) {

        echo $carta . "<br>";

    }

}
?>