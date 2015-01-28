# Objects

Objects have both **Behaviors** and **Attrabutes**

---

### Methods:

Methods are functions within a class:

```java
public class car {
    double speed;
    double drive(int time) {
        double dist;
        dist = time*speed
        return dist
    }
}
```

The **heading** is what identities the method:
```java
    double drive(int time) { /*...*/ }
```

The remainder of the method is the **body**:
 ```java
    double drive(int time) {
        double dist;
        dist = time*speed
        return dist;
    }
```

----
A **Return Statement** must return the same data type as the method heading. Once a return statement is reached, the method instantly stops. For example, in the following code, *// code here* is never run because the program returns before it is reached. This will produce a compile time error:

```java
    void method() {
        return;
        // code here
    }
```

---
**Local Variables** are declared inside a method (eg. dist) and are only visible there. In the above method *drive*, the dist variable is a local variable.
```java
    double dist;
```
----
**Parameters** are passed in with methods:
```java
    public someMethod(int param1, int param2, /* etc */) {
        /* ... */
    }
```
These are passed in with the method call and are **Local Variables** within the method. 

**Arrays** can also be Parameters. They are used like this:
```java
public class car{
    public void someMethod(int[] a){
        for(int i = 0; i < a.length; i++)
            a[i] = a[i] + 10;
    }
}
    // To Call:

    int[] a = {1, 2, 3};
    car c = new car();
    c.someMethod(a);
```

This will actually add 10 to each item because when an array is passed as a parameter, the **Address** is passed, not the values. As a result, when an array is changed within a method, the external array reflects that function. This **Does Not** work for objects like strings which are immutable.

-----

#### Variable Length Parameter Lists

Sometimes it is nice to be able to pass a variable number of arguments into an array:
```java
avg = a.average(1,2,3);
avg2 = a.average(1,2,3,4,5);
```

This can be accomplished by using **Variable Length Parameter Lists**:

```java
public class a {
    public double average(int...list) { // the ... is important
        int sum = 0;
        double result;
        if (list.length != 0) { 
            for (int num : list) {
                sum += num;
            }
            result = (double) sum / list.length;
        }
    }
}
```
