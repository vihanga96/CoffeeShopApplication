# CoffeeShopApplication
CoffeeShop application made with Rest API using spring boot framework and MYSQL database.

<h1>About this<h1>
 <p>This is a Coffee Shop Application and here there are so many tasks.Add new products,view products,view orders,add new orders are some of them.</p>
<h1>Steps to run this application</h1>
<br><br>
1.First you can simply download the package from the link.<br><br>
2.Then open your IDE(I am using eclipse) then import your package.<br><br>
<nbsp><nbsp><nbsp><nbsp><nbsp><nbsp>*Go to file,select import,select file path. Then You will download some dependencies also.<br><br>
3.Up your database server.<br><br>
4.Now export the data base which in the package named as coffeeshop.sql<br><br>
<nbsp><nbsp><nbsp><nbsp><nbsp><nbsp>*I have included database backup in this package.<br><br>
5.Before run the service check the server port number.(I used apache tomcat and default port number is 8080)<br><br>
<nbsp><nbsp><nbsp><nbsp><nbsp><nbsp>*If the port number 8080 use in your PC you will get a error message when your run the service.<br><br>
6.Now run the service.<br><br>
7.Now you can view existing ordrs by enter http://localhost:8080/products in the web browser.<br><br>
<nbsp><nbsp><nbsp><nbsp><nbsp><nbsp>*If you change the port number you have to edit it according to your port number.I added some data into db so you can view the existing products.<br><br>
8.Or by useing postman application(I used postman application) you can simply view existing orders.<br><br>
9.Now you can add new products by using command prompt or you can use postman application and type localhost://products.<br><br>
10.Select post method,raw data,json and type the quary below mentioned in postman.<br><br>
 {      "pid": 303,<br>
        "pname": "Tea",<br>
        "price": 200.0<br>
    } <br><br>
11.All the data will be store in the database.<br><br>
12.Now if you want to view only selected order you can enter simply like this in your web browser.
http://localhost:8080/products/{selected index}<br><br>
13.Like I have above mentioned you can easily view orders,add new orders and you can view only selected orders.<br><br>
http://localhost:8080/orders<br><br>
http://localhost:8080/orders/{selected index}<br><br>
14.I added database queries in this packege.

