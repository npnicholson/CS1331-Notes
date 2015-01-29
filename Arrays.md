# Arrays

**Arrays** are lists of values that can be accessed with an index number: 

```java
int[] scores = {73, 12, 43};
```

*scores* from the above code would contain the following:

index|value
----|-----
0|37
1|12
2|43

In addition, values can be accessed by using the following syntax:

```java
int num;
num = scores[1];
System.out.println("Num contains " + num + " at index 1");
```

### Structure of Arrays

Arrays are **objects** in Java which means they have their own self contained structure and behaviors. As such, they have a constructor:
```java
int[] scores = new int[3];
  |     |              |
  V     V              V
Type  Name            Size
```

Array size is locked in place from the start. They are also homogeneous; Can't store **Integers** or **Strings** or **booleans** together

### Array Application

#### Declaring an Array

While Java allows for several different methods of declaring an array, the following is the most used:

```java
int[] scores;
scores = new int[3];
```

Once the array has been declared, it is easy to change or assign elements. Remember: **An array size is fixed**.

In addition Java does *automatic bounds checking*. This means that any  attempt to access outside this bound will result in a runtime exception: ***ArrayIndexOutOfBoundsException***

#### Array Length
Java array's length is held as a **constant** called *length* in the array object (a private constant within the array class).

In our above example, *score.length* would return an integer value of 3.

#### Cycling through an Array

The length is useful for cycling through each element in an array because it allows code to work with arrays of variable length:

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```
In the above code, the for loop iterates from 0 to *scores.length* - 1 which is perfect because **the index of an array starts at 0**.

Java also allows allow for an alternative method of iterating through the array called a **For Each Loop**:

```java
double[] a;
for (double element : a)
    System.out.println(element);
```
The loop above sets the double *element* to each value in *a* in succession. That being said, the double *element* in the loop above is private to the loop and as a result, it can't be used to change the double[] array *a*. For Each Loops are used to getting information from an array if literals, not setting it.

#### Arrays of Objects

Java allows arrays to contains **Objects** like **String** or the object form of int, **Integer**. Declaring an object array is very similar to our example above. The only difference is the data type:
```java
String[] words = new String[25];
```
It is worth noting that in the example above, **Each string in words must be declared as well**. For example:
```java
string[0] = new String("Some Word");
```
This is because an array of objects contains a **pointer** to the object in memory, not the object itself. If the pointer is not connected with an object in memory, it is *null*.

Both types of loops for iterating work with object arrays, although for each loops provide a pointer to the object in memory, meaning that a for each loop that iterates through an object array **has the ability to work with each element directly**. For example, the following code will create a list of 10 *myObj*'s and set each object's *someIntValue* to 100:

```java
myObj[] list = new myObj[10];
for (obj o : list) {
    System.out.println(o.getMyMethod);
    o.someIntValue = 100;
}
