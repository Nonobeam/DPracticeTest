# Post setup
- Need to have gradle installed
- Build gradle project with Groovy as build script <br>

```gradle init```

# Build gradle project
- View the project structure <br>
```gradle -q projects```

# Run test
## Run all test class <br>
```gradle test```
## Run specific test clas <br>
```gradle test --tests {test-class-name}```
## Run specific method in a test class <br>
```gradle test --tests {test-class-name}.{method-name}```
## Run some specific method in some test classes <br>
```gradle test --tests {test-class-name}.{method-name} --tests {test-class-name}.{method-name}```

# Excute build, run, test and further more with multi project
## Structure
1. As we can see project structure will put the root project in the first position when we run the ```gradle -q projects```. So that if we want to run in other project, we need to specify which one we want to use. <br>

```gradlew :lib:test --tests MathLibraryTest1``` <br>
2. This line will help us specify the project lib (default: always start with :).