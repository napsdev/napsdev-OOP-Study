# Intance of python
from user import User
if __name__ == "__main__":
    # Intance of python
    user = User()
    user.Name = "Jaime Valencia"
    user.Document = "1105792813"
    user.Email = "jaime@algo.com"
    print(vars(user))

    seller = User()
    seller.Name = "María Pérez"
    seller.Document = "1105793458"
    seller.Email = "maria@algo.com"
    print(vars(seller))
