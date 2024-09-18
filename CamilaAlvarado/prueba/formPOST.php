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