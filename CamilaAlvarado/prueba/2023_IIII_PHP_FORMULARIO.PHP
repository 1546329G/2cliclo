<?php
if($_POST){

    //Recibi Informacion del Formulario HTML metodo POST
    $Num01    = $_POST['txtNumero01'];
    $Num02    = $_POST['txtNumero02'];
    $Operador = $_POST['txtOperador'];

    if($Operador =="+"){
    echo "La Suma es: ".$Num01+$Num02;

    }else if($Operador=="-"){
        echo "La Resta es: ".$Num01-$Num02;

    }else if($Operador=="*"){
        echo "La Multiplicacion es: ".$Num01*$Num02;

    }else if($Operador=="/"){
        echo "La Division es: ".$Num01/$Num02;
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi primera pagina</title>


</head>
<body>
    
<form action="" method="post">

<input type="text" name="txtNumero01" id="">
<br>
<input type="text" name="txtNumero02" id="">
<br>
<input type="text" name="txtOperador" id="">
<br>
<input type="submit" value="Enviar">

<!-- Variables y Constantes
<input type="button" value="Enviar">

-->


</form>


</body>
</html>