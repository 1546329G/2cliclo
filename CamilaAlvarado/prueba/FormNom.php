<?php
if($_POST){
 $Nomb    = $_POST['txtNombres'];
 $Apell    = $_POST['txtApellidos'];
 $Edad = $_POST['txtEdad']; 
 echo "Mi nombre es:  ".$Nomb."<br>";
 echo "Mi apellido es:  ".$Apell."<br>";
 echo "Mi Edad es:  ".$Edad."<br>";
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
        <input type="text" name="txtNombres" id="">
        <br>
        <input type="text" name="txtApellidos" id="">
        <br>
        <input type="text" name="txtEdad" id="">
        <br>
        <input type="submit" value="Enviar">
        
</form>

   
</body>
</html>