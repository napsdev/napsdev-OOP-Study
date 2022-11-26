class User {
    constructor(Name, Document, Email) {
        // Attributes
        this.Id;
        this.Document = Document;
        this.Type;
        this.Name = Name;
        this.Password;
        this.Email = Email;
        this.Address;
    }
    //Methods
    printDataUser = () => {
        console.log(this.Name);
    }
}


