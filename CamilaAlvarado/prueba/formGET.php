<?php
if($_GET){
 $Nomb    = $_GET['txtNombres'];
 $Apell    = $_GET['txtApellidos'];
 $Edad = $_GET['txtEdad']; 
 echo "Mi nombre es:  ".$Nomb."<br>";
 echo "Mi apellido es:  ".$Apell."<br>";
 echo "Mi Edad es:  ".$Edad."<br>";
}
?>