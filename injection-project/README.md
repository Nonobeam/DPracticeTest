# Build this project

## Step by step with explaination

### Compile class
1. We will compile 2 different files, 1 with Calculator and 1 with Main <br>
a. Compile Calculator class <br>
```javac -d target/classes library/src/app/Calculator.java``` <br>
b. Compile Main class <br>
```javac -d target/classes -cp target/classes main/src/project/Main.java``` <br>

### Build jar to run
1. We will build this into jar file <br>
```jar cvf target/Main.jar -C target/classes  .```

### Finally run it

```java -cp target/Main.jar project.Main```

## 1 line solution

(Window command line) <br>
```javac -d target/classes library/src/app/*.java && javac -d target/classes -cp target/classes main/src/project/Main.java && jar cvf target/Main.jar -C target/classes  . && java -cp target/Main.jar project.Main```

(PowerShell) <br>
```javac -d target/classes library/src/app/*.java ; javac -d target/classes -cp target/classes main/src/project/Main.java l jar cvf target/Main.jar -C target/classes  . ; java -cp target/Main.jar project.Main```


