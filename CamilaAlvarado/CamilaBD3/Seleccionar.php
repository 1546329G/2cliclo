<?php

//$servidor="localhost";

$servidor="localhost:3307";

$usuario="root";

$contrasenia ="";

$bd="alumnodat";

 

 

try {

    $conexion = new PDO("mysql:host=$servidor; dbname=$bd", $usuario, $contrasenia);

    $conexion->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

   // $sql= "insert into notas (Id_Alumno, Nomb_Alumno, Apel_Alumno, Edad_Alumno,Seme_Alumno) VALUES (NULL, 'Jose','Alvarado', 15,'II')";

   $sql= "select * from notas";

   

    $sentencia = $conexion->prepare($sql);

    $sentencia->execute();

    $resultado = $sentencia->fetchAll();
    $conexion->query($sql);

 

    echo "Conexion Establecida";

 

} catch ( PDOException $error) {

    echo "Conexion Erronea".$error;

}

 

?>