<?php
include_once('Payment.php');
class Paypal extends Payment{
    public $email;
    
    public function __construct($id,$amount,$email){
        parent::__construct($id,$amount);
        $this->email = $email;
    }
}
?>