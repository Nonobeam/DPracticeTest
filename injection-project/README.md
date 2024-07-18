### Build class for library
1. This will compile the Calculator.java into class file and put it in the target/classes dir
```javac -d target/classes library/src/common/Calculator.java```

### Build class for main
1. This will compile the Main.java into class file and put it in the target/classes
```javac -d target/classes -cp target/classes main/src/project/Main.java```

## Build jar file from Main.class
1. Build the main class we have just created
```jar cvf target/project/Main.jar -C target/classes .```

## Build that jar file
1. Build that jar file (This will not include manifest)
```java -cp target/project/Main.jar project.Main```

2. Build jar with MANIFEST
``` jar cvfm target/project/ManifestMain.jar META-INF/MANIFEST.MF -C target/classes . ```
``` java -jar target/project/ManifestMain.jar```

## Build script
1. Without MANIFEST

```javac -d target/classes library/src/common/Calculator.java && javac -d target/classes -cp target/classes main/src/project/Main.java && jar cvf target/project/Main.jar -C target/classes . && java -cp target/project/Main.jar project.Main```

2. Include MANIFEST

```javac -d target/classes library/src/common/Calculator.java && javac -d target/classes -cp target/classes main/src/project/Main.java && jar cvf target/project/Main.jar -C target/classes . && jar cvfm target/project/ManifestMain.jar META-INF/MANIFEST.MF -C target/classes . && java -jar target/project/ManifestMain.jar```



# CASE STUDY 1

```javac -d target/classes library/src/common/Calculator.java && javac -d target/classes -cp target/classes main/src/project/Main.java && jar cvf target/project/Main.jar -C target/classes . && java -cp target/project/Main.jar Main```

# CASE STUDY 2

```javac -d target/classes library/src/common/Calculator.java && javac -d target/classes -cp target/classes Main.java && jar cvf target/project/Main.jar -C target/classes . && java -cp target/project/Main.jar project.Main```
