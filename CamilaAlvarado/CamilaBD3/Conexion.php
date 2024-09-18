<?php
//Conexion con BD 
//Variable en php //Dato de Heidi
$servidor = "localhost:3307";
$usuario = "root";
$contrasenia = "";
$bd = "alumnodat";
try{
    $conexion = new PDO("mysql:host=$servidor; dbname = $bd" ,$usuario ,$contrasenia);
    $conexion-> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    //$sql = "insert into notas (Id_Alunno, Nomb_Alumno, Apel_Alumno, Edad_Alumno, Seme_Alumno) VALUES (NULL,'Jose','Alva',18)";
    $sql = "select * from notas  ";

    $sentencias = $conexion->prepare($sql);
    $sentencias->exacute();
    $resultado = $sentencias->fetchAll();
    
    foreach ($resultado as $x){
        echo ($x['Nomb_Alumno']."<br>");
    }
    $conexion ->query($sql); 
    echo "Conexion Establecida";
}catch(PDOException $error){
    echo"Conexion No Establecida".$error;
}

?>