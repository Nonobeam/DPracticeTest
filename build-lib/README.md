* Post-condition 
- Using docker mysql image (MYSQL_ROOT_PASSWORD = 123)

* Build From Jar file 

*** Build Main.class ***
- Step 1: <br>
```javac -d . -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main.java```

- Step 2: <br>
*** Run project *** <br>
```java -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main```

** Build All-in-one ** <br>
```javac -d . -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar/Main.java && java -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main```

** Alternative ** <br>
- In case we need to create and run with jar file.

```jar cfe alter.jar BuildFromJar.Main -C . BuildFromJar -C . lib -C dao . && java -cp alter.jar;lib/mysql-connector-j-8.0.33.jar;. BuildFromJar.Main```

- Jar file build manually and build with MANIFEST
- Step 1: <br>
Zip the project (include MANIFEST.MF) and name it {build} <br>
- Step 2: <br>
```java -jar build.jar```
<br>
* Multithreading with java *