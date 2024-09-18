<?php
$Año = 2023;
$Mes = 5;
switch ($Mes) {
    case '1':
        echo 'El mes de Enero tiene 31 días del año '.$Año;
        break;
    case '2':
        if ($Año%4==0){
            echo 'El mes de Febrero tiene 28 dias '.$Año.' este año tiene 365';
        }else{
        echo 'El mes de Febrero tiene 29 dias '.$Año.' este año es biciesto ';
        }
        break;
    case '3':
        echo 'El mes de Marzo tiene 31 días del año '.$Año;
        break;
    case'4':
        echo 'El mes de Abril tiene 30 días '.$Año;
        break;
    case '5':
        echo 'El mes de Mayo tiene 31 días del año '.$Año;
        break;
    case'6':
        echo 'El mes de Junio tiene 30 días '.$Año;
        break;
    case '7':
        echo 'El mes de Julio tiene 31 días del año '.$Año;
        break;
   
    case '8':
         echo 'El mes de Agosto tiene 31 días del año '.$Año;
        break;
    case'9':
        echo 'El mes de Septiembre tiene 30 días '.$Año;
        break;
    case '10':
        echo 'El mes de Octubre tiene 31 días del año '.$Año;
        break;
    case '11':
        echo 'El mes de Noviembre tiene 30 días '.$Año;
        break;
    case '12':
        echo 'El mes de Diciembre tiene 31 días del año '.$Año;
        break;

    default:
        echo 'Fecha no valida';
        break;
}
?>