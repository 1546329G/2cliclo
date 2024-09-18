<?php
#funciones como en java
#Parecido a Constructores
function Dato02($nombre, $apellido, $edad=0){

    echo 'Mi nombre es: '.$nombre.'<br> Mi apellido es: '.$apellido.'<br> Mi edad es: '.$edad.'<br>';

}
 

Dato02("Jose" , "Miguel", 15);

Dato02("Claudio" , "seeee" );

#Constructores con numeros
echo '-----------------------------------';

function Dato03($N01, $N02){

    return $N01+$N02;
 

}

$resultado = Dato03(9,8);

echo 'El resultado es: '.$resultado;
?>