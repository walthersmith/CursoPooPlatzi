<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license,$driver){
        $this->licence = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "Licence: " . $this->licence . " Name Diver: " . $this->driver->name;
    }
}
?>