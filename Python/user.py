class User:
    # Attributes
    Id = int
    Document = str
    Type = str
    Name = str
    Password = str
    Email = str
    Address = str

    # Methods
    def __init__(self, Name, Document):
        self.Name = Name
        self.Document = Document
