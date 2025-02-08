```groovy
class MyClass {
    def myMethod(Closure closure) {
        closure() // Missing parameter handling
    }
}

MyClass myClass = new MyClass()
myClass.myMethod { 
    println it // It is null; exception
}
```