<?php
class Persona{

    private $Nom;
    private $Ape;
    private $Edad;

    public function setnombre ($Nom){
        $this-> Nom = $Nom;
    }
    public function getnombre (){
        return $this->Nom;
    }
    public function setapelliido ($Ape){
        $this-> Ape = $Ape;
    }
    public function getapellido (){
        return $this->Ape;
    }    
    public function setedad($Edad){
        $this-> Edad = $Edad;
    }
    public function getedad (){
        return $this->Edad;
    }
    public function imprimir(){
        echo "Soy ".$this->Nom." me apellido ".$this->Ape."Tengo ".$this->Edad."<br>";
    }
} 


class Trabajador extends persona{
    private $Puesto;
    
    public function setpuesto($Puesto){
        $this->Puesto = $Puesto;
    }
    public function getpuesto(){
        return $this->Puesto;
    }
    public function imprimrirTrab(){
        echo "Hola soy ".$this->getnombre()." tengo ".$this->getedad()." mi puesto de trabajo es ".$this->Puesto."<br>";
    }
}
//$imp = new persona();
$impT = new Trabajador(); 
$impT->setnombre("CAMI");
//$impT->setapelliido("ALVA");
$impT->setedad("18");
$impT->setpuesto("GERENTE");
/*echo "<br>".$impT->getnombre()."<br>";
echo "<br>".$impT->getapellido()."<br>";
echo "<br>".$impT->getedad()."<br>";
echo "<br>".$impT->getpuesto()."<br>";*/
$impT->imprimrirTrab();
?>