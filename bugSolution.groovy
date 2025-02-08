```groovy
class MyClass {
    def myMethod(Closure closure, Object param) {
        closure(param) 
    }
}

MyClass myClass = new MyClass()
myClass.myMethod("Hello, World!") { 
    println it // prints "Hello, World!"
}

// Alternative using `call` for more flexibility
class MyClass2 {
    def myMethod(Closure closure, Object... params) {
        closure.call(*params)
    }
}
MyClass2 myClass2 = new MyClass2()
myClass2.myMethod("Hello", "World!") {a, b -> println "$a $b"}
```