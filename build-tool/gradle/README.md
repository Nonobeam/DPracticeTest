# Post setup
- Need to have gradle installed
- Build gradle project with Groovy as build script <br>

```gradle init```

# Build gradle project


# Run test
## Run all test class <br>
```gradle test```
## Run specific test clas <br>
```gradle test --tests {test-class-name}```
## Run specific method in a test class <br>
```gradle test --tests {test-class-name}.{method-name}```
## Run some specific method in some test classes <br>
```gradle test --tests {test-class-name}.{method-name} --tests {test-class-name}.{method-name}```