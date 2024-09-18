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



$imp = new persona();
 
$imp->setnombre("CAMI");
$imp->setapelliido("ALVA");
$imp->setedad("18");
echo "<br>".$imp->getnombre()."<br>";
echo "<br>".$imp->getapellido()."<br>";
echo "<br>".$imp->getedad()."<br>";

?>