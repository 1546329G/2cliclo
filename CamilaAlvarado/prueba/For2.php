<?php
$arrAzar = array();
$arrElegidos = array(14, 15, 13, 14, 12);
$coincidencias =[];
echo 'Tus números elegidos son: <br>' .$arrElegidos . '<br>';

for ($i = 0; $i < 5; $i++) {
    $numero = rand(10, 15);
    $arrAzar[] = $numero;
}

$cantidad = count($arrAzar);
for ($i = 0; $i < $cantidad; $i++) {
    echo $arrAzar[$i] . '<br><br>';
}
foreach ($arrElegidos as $elegido) {
    foreach ($arrAzar as $azar) {
        if ($elegido == $azar) {
            $coincidencias[] = $elegido;
            break;}
    }
}

if ($arrAzar == $arrElegidos) {
    echo '¡Felicidades! Ganaste';
} else if ($coincidencias > 0) {
    echo 'No coinciden <br>';
    echo "Los arrays tienen count($coincidencias) coincidencias y son: ".$coincidencias;
}

?>