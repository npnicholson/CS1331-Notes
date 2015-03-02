# Abstract Classes

```java
public abstract class Animal { 
    public abstract void makeNoise();

    public Color getColor() {
        return color;
    }
}
```

In the example above, abstract classes can have **abstract** methods as well as **non abstract** methods. 

**You cannnot use the *new* opperator with abstract classes**. You can, however, use **new** with classes that extends the abstract class.

```java
// Rhino extends Animal above
Animal al = new Rhino();
```

The following code, run after the code above, will run the Rhino method, not the Animal method because Rhino is supposed to implement the *makeNoise()* method.

```java
al.makeNoise();
```

However, the following code will run the Animal method because *getColor()* is fully defined in Animal. If Rhino overrides the *getColor()* method, then the Rhino method will be run:

```java
al.getColor();
```

You can cast object types as follows to force Java to do so:

```java
(Rhino)al.charge();
```

### Abstract Constructors

Abstract classes can and should have concrete constructors, not because *you* will call it but because of the super call.
```java
public Animal (Color c, int numLegs) {
    color = c;
    this.numLegs = numLegs;
}

///

public Rhino(Color c, int numLegs, Country co) {
    super(c,numLegs);
    ///
}
```
### Important Notes about Abstract

* A *subclass* can be abstract even if its *superclass* is not. This is evident because the *Object* class is not abstract.

* A class can override a method from its parent and declare it as abstract. This is uncommon but possible.

* Difference between abstract class and an interface:
    * An abstract is a *class* that holds abstract methods
    * An interface is not a *class* but instead provides a *structure* that other class need to follow to be valid

### Good uses for Abstract

It allows us to create very generic code like this. Each animal can have its own feed method that is called by this line of code
```java
for(Animal a : animals) {
    a.feed();
}
```

