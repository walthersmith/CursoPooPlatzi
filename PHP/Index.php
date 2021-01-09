<?php
include 'Account.php';
include 'Car.php';

$car = new Car("ZXC344",new Account("Walther Smith","DDS1234"));
$car->printDataCar();
echo '<br>';
$car = new Car("QWE123",new Account("Martha","WQS456"));
$car->printDataCar()

?>