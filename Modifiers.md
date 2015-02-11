# Modifiers

## Static Variables

So far we have seen **local** variables and **Instance** variables. Another kind are **Static** variables. These are unique in that one copy is shared by all instances of its containing type. For example, if three objects are created that all share a **Static** variable, they will all contain the same value.

### Declaration

```java
private static int count = 0;
```

The memory space for this variable is in the *Class* not each *Instance* of the class. For constants, this is useful because it saves memory.

They can also be used to **count objects**.

```java
public class someObj {
    private static int count = 0;
    public void someObj() {
        // constructor code
        count++;
    }
}
```

The above class has code that will add to the static variable *count* each time a new object is instantiated. 

## Static Methods

Just like **Static Variables**, **Static Methods** are native to the **Class** rather then the **object**. They do not operate in the context of a reticular object (There is not *this*). This means **they cannot access instance variables** because they do not reside within an instance object.
