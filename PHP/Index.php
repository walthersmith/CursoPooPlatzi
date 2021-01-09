<?php
require_once('Car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('Account.php');

$car = new Car("ZXC344",new Account("Walther Smith","DDS1234"));
$car->printDataCar();
echo '<br>';
$car = new Car("QWE123",new Account("Martha","WQS456"));
$car->printDataCar();

echo '<br>';
echo 'UBERX<br>';
$uberx = new UberX("CVX1234",new Account("Adres Herrera","AND456"),"Crevrolet",'Spark');
$uberx->printDataCar();
echo '<br>';
echo 'UBERPOOL<br>';
$uberPool = new UberPool("HGN1234",new Account("Adrea Ferran","AND552"),"Dodge",'Attitude');
$uberPool->printDataCar();
?>