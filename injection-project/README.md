```javac -d target/classes library/src/app/Calculator.java && javac -d target/classes -cp target/classes main/src/project/Main.java && jar cvf target/Main.jar -C target/classes  . && java -cp target/Main.jar project.Main```


