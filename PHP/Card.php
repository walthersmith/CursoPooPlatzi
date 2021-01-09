<?php
include_once('Payment.php');
class Card extends Payment{
     public $cardNumber;
     public $cardDate;
     public $cardCvv;

    public function __construct($id,$amount,$cardNumber,$cardDate,$cardCvv){
        parent::__construct($id,$amount);
        $this->cardNumber = $cardNumber;
        $this->cardDate   = $cardDate;
        $this->cardCvv    = $cardCvv;

    }
}
?>