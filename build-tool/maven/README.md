# Incase of not having mvn installed in computer, use this below instead <br>

``` mvnw.cmd ``` + option + ....

# Clean and package the source code 
- We can remove the "clean" option if we don't intend to clean it <br>
```mvn clean package```

# Build runnable Jar file <br>

```java -jar target/maven-project.jar```

- Merge version <br>
(This version run in window commandline) <br>
```mvn clean package && java -jar target/maven-project.jar``` 

* Incase we want to run only 1 single test class or method <br>

# Running all tests in a single class <br>
mvn test -Dtest=CalculatorTest1 <br>

# Running a single test method <br>
mvn test -Dtest=CalculatorTest2#testMinus <br>