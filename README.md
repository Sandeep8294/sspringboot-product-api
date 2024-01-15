     				Product Assignment using java, gradle and MySql.
      Steps to Run the project
1)	Download the project from git url- https://github.com/Sandeep8294/sspringboot-product-api.git
2)	Install Mysql  by following the link- https://dev.mysql.com/doc/refman/8.0/en/windows-installation.html
3)	Once Mysql is installed create the db data.
4)	Open the code in IntelliJ  and change the username ,password,url as per your own credentials of mysql details in application.properties file.
5)	Run the spring-boot application .Entity will be created while starting  the application .
6)	Open the swagger Url in your browser- http://localhost:8080/swagger-ui/index.html#
7)	Once the swagger is open we can see all the api’s listing .
8)	We can Hit all the api’s from swagger and check.


Software and tools Used
1)Mysql
2)Java 1.8
3)SpringBoot
4)JPA for database interaction.
5)swagger implementation is done for listing the api’s and hitting the api easily from browser itself.




APIs and its Description

1)Product

a) Post api/product/create

This is use to create the new product single .

Request-

{
"name": "Pulsor",
"price": 770.0,
"productType": "ev",
"productCode": 101,
"year": 2023
}


Response-


{
"id": 253,
"name": "Pulsor",
"price": 770.0,
"productType": "ev",
"productCode": 101,
"year": 2023
}

b) GET api/product/fetch-all

It gives all the product created .

Response-
[
{
"id": 1,
"name": "Car",
"price": 100,
"productType": null,
"productCode": null,
"year": null
},
{
"id": 2,
"name": "Bike",
"price": 770,
"productType": null,
"productCode": null,
"year": null
}
]

c) PUT /api/product/{id}=2

This service is used to update the product in Db

Request-

{
"name": "Bike",
"price": 770,
"productType": "EV",
"productCode": "EV101,
"year": null
}

Response-

{
"name": "Bike",
"price": 770,
"productType": "EV",
"productCode": "EV101,
"year": null
}

d) GET /api/product/{id}

This service is used to get the product by there productId

Request-
Id

Response-

{
"id": 2,
"name": "Bike",
"price": 770,
"productType": null,
"productCode": null,
"year": null
}

e) DELETE api/product/delete/{1}

This service is used to delete the product from db by its id.

Request-

Id

Response-
{
“message”:”String”,
“status”:”String”
}

Database Details

Database name-assignment

Entity-

a)Product
Column name-

i)id-autogenerated
ii)name
iii)price
iv)productType
v)productCode
vi>year
