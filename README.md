
# SpringBoot JPA
 
A well packaged basic implementation of springboot JPA using spring data and Java Persistence API's.

Original content from [JavaTpoint](https://www.javatpoint.com/spring-boot-jpa), only change is the package organization.

## Getting Started
Clone this repo to your local machine [How To Guide](https://www.howtogeek.com/451360/how-to-clone-a-github-repository/)

### Prerequisites

- Basic Knowledge of JAVA. Great tutorial on [Javatpoint](https://www.javatpoint.com/java-tutorial).
- Java JDK 8 at least  installed locally Oracle Docs for [Mac](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE) & [Windows](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-A7E27B90-A28D-4237-9383-A58B416071CA).
- [Maven installed](https://maven.apache.org/guides/index.html)
- Basic knowledge of Springboot
- Postman

### Installing
Install all project dependencies with:

``$ mvn install``

###How to run


####Maven 
Open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:

``$ java -version``

``$ mvn -v``

You should get the versions of Java and Maven.

####Using the Maven Plugin

The Spring Boot Maven plugin includes a run goal that can be used to quickly compile and run your application. Applications run in an exploded form, as they do in your IDE. The following example shows a typical Maven command to run a Spring Boot application:

``$ mvn spring-boot:run``


####Using Executable Jar

To create an executable jar run:

``$ mvn clean package``


#### Testing - From [JavaTpoint](https://www.javatpoint.com/spring-boot-jpa)

``Step 19: Open the browser and invoke the URL http://localhost:8080/. It returns an empty list because we have not added any user in the List.``

``To add a user to the database, we will send a POST request by using the Postman.``
  
``Step 20: Open the Postman and do the following:``
  
``Select the POST``

``Invoke the URL http://localhost:8080/add-user.``

``Click on the Body``

``Select Content-Type as JSON(application/json).``

``Insert the data which want to insert in the database. We have inserted the following data:``

````
{  
    "id": "001",  
    "name": "john",  
    "email": "john@gmail.com"  
}  
````
``When we click on the Send button, it shows Status:200 OK. It means the request has been successfully executed.``

``Step 21: Open the browser and invoke the URL http://localhost:8080. It returns the user that we have inserted in the database.``


  
## Built With
* [Java](https://www.java.com/en/download/)
* [Apache Maven](https://maven.apache.org/guides/index.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Apache Derby]()