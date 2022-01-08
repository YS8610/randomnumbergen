# Random Number Generator Webpage

The website is created using Spring Boot framework using ThymeLeaf as the template engine.  
The website consists of a user input which can only accept integer from 0 to 30.  
Error page will be displayed if non integer is entered or is not in range of 0 to 30.  
  
When user enter a integer from 0 to 30, the form will send out a get requests and then display a number of pictures that the user inputted.  
  
To run the code, run the following command in the root directory.
```
mvn spring-boot:run
```