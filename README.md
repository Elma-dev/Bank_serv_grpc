# Bank_serv_grpc
bank service with grpc (google remote protocole call)

# Fundamentales of Grpc
![image](https://user-images.githubusercontent.com/67378945/226477266-23f04197-b95d-45fe-abb3-60fcb0284433.png)
![image](https://user-images.githubusercontent.com/67378945/226477333-6ece3c41-187f-4020-922d-88e9c4461f82.png)

# Proto Vs JSON VS XML

![image](https://user-images.githubusercontent.com/67378945/226477496-52a852b9-8708-4d38-94fb-634f97355dda.png)

# GRPC Models
**Unary Models**

![image](https://user-images.githubusercontent.com/67378945/226477616-25867f3c-4889-4725-bdae-557db6e7f973.png)

**Server Streaming Models**

![image](https://user-images.githubusercontent.com/67378945/226477699-95237787-0a9f-4226-b17a-0ac50abf614f.png)

**Client Streaming Models**

![image](https://user-images.githubusercontent.com/67378945/226478007-39224f2e-b41e-4c33-9b7a-94fbf2c9587a.png)

**Bi-Directinal Streaming Models**

![image](https://user-images.githubusercontent.com/67378945/226478280-0e3b1f84-ac02-46f2-b313-20ca5dd790c2.png)

# Create A ProtFile

![image](https://user-images.githubusercontent.com/67378945/226478585-4fdfac69-fc55-4161-846f-6b673fcc664d.png)

# Compile ProtoFile
![prot](https://user-images.githubusercontent.com/67378945/226479027-560d65f5-6c4c-4329-917d-97d7dfeeccf3.jpg)

# Create ServicesClass:
After Compling of class you get Stubs classes:

Service Class extends from **nameServicegrpc.NameServiceImplBase**

![image](https://user-images.githubusercontent.com/67378945/226479448-146b6cd0-4c2e-4c80-92e8-09b222206346.png)

# Create Server
Very easy

![image](https://user-images.githubusercontent.com/67378945/226484125-9f99767e-6960-4415-858f-ece51e4b85d3.png)

# Test
You can test your server with BloomRPC 

![image](https://user-images.githubusercontent.com/67378945/226484285-4b06705d-7cac-4340-bd75-625d867aa631.png)

