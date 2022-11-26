<?php
class User{
    # Attributes
    public $Id;
    public $Document;
    public $Type;
    public $Name;
    public $Password;
    public $Email;
    public $Address;

    #Methods
    public function __construct($Name, $Document)
    {
        $this->Name = $Name;
        $this->Document = $Document;
    }

    public function printDataUser()
    {
        echo "Name: $this->Name";
    }
}
