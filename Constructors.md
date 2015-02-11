# Constructors

Some constructors need to take in data in order to function properly. The following code is for copying a Car. If it gets no car (null) then it exits the program because it doesn't know what happened.

```java
public car (Car c) {
    if (c != null){
        this.year = c.year;
        this.mpg = c.mpg;
        this.model = c.model;
    } else {
        System.out.println("Some big error here");
        System.exit(0);
    }
}
```

### Shallow Copy

```java
// Person: int birthyear, String name, Car car;

public Person (Person p) {
    if(p == null)
        //issues
    this.birthyear = p.birthyear;
    this.name = p.name;
    this.car = p.car; // Problem
}
```
The above code is an issue because it has a **Reference** to *p*'s car rather then a car itself. This is **Shallow copying**
