# Inheritance

Process of deriving a new class from existing ones. Auto contains some or all of the methods of the original. Can add new ones as well. You can **only extend *one* parent**

Parent/Super/Base class => Child/subclasses

Uses the keyword **extends**.

```java
public class Car {
    // code here
}

// --- //

public class Ford extends Car {
    // Ford is a car
}
```

In the above example. Car cannot access data or methods of Ford beyond normal.

```java
    Ford f = new Ford(/*-*/);
```

The child class can access public data/methods from the parent but cannot access private data/methods of the parent.

The child actually gets private data **but it cant access it**.

**Protected**: Can be accessed by a child class but not outsiders (non children classes)

You can call parent methods without qualification. Its like they are yours as a child class. This also allows for accessing instance data.

```java
super()
```
The above statement will call the super class's constructor with the given arguments. This is similar to the following code that runs the local constructor with the given arguments:
```java
this()
```

## Automatic Super()

When a child class is created, it is automatically given **super()** in its constructor if **You did not give it one alread**

```java
public class superClass {
    public superClass(int a) {
        // code
    }
}

// --- //

public class childClass extends superClass {
    public childClass() {
        // code
    }
}
```

The above code is a **Compiler Error** because **super()** is automatically inserted into the childClass constructor. Because the superClass has no empty constructor (public superclass() { /* */ }), the **super()** that is added to the childClass has no constructor to go to. 

This could be fixed by defaulting to the automatic constructor for the superClass **or** adding the appropriate super(int a) constructor to the childClass constructor.

**Definition**

If the first line of the constructor is not a call to a super class constructor, then Java will insert one for you.
