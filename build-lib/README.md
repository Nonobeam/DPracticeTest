* Post-condition *
- Using docker mysql image (MYSQL_ROOT_PASSWORD = 123)

* Build From Jar file *

*** Build Main.class ***
- Step 1:
```javac -d . -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main.java```

- Step 2:
*** Run project ***
```java -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main```

** Build All-in-one **
```javac -d . -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar/Main.java && java -cp .;lib/mysql-connector-j-8.0.33.jar BuildFromJar.Main```

** Alternative **
- In case we need to create and run with jar file.

```jar cfe alter.jar BuildFromJar.Main -C . BuildFromJar -C . lib -C dao . && java -cp alter.jar;lib/mysql-connector-j-8.0.33.jar;. BuildFromJar.Main```

- Jar file build manually and build with MANIFEST
- Step 1: 
Zip the project (include MANIFEST.MF) and name it {build}
- Step 2:
```java -jar build.jar```

* Multithreading with java *