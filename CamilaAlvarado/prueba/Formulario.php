<?php
if($_POST){
    $Num01    = $_POST['txtNumero01'];
    $Num02    = $_POST['txtNumero02'];
    $Operador = $_POST['txtOperador'];

    if($Operador=="+"){
        echo "La suma es: ".$Num01+$Num02;
    }else if()

}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action ="" method="post">
        <input type="text" name="txtNumero01" id="">
        <br>
        <input type="text" name="txtNumero02" id="">
        <br>
        <input type="text" name="txtOperador" id="">
        <br> 
        <input type="submit" value="Enviar">
    </form>
</body>
</html>