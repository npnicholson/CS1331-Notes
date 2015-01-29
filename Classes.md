# Classes

Classes are bits of code that form **Objects** in Java. Some are provided with java and need to be imported to use while others are user created. The *java.lang* class is automatically imported for every java program and includes the **String** class.

Classes are grouped into **packages**, or sets of related classes:
|Packages|
|--------|
|java.io|
|java.lang|
|java.math|
|java.sql|
|java.util|
|etc...|

## Importing Classes

Classes other then those contained in *java.lang* must have their package **imported** in order to fully qualify them. There are two methods of doing this:
1. Explicit import: *java.util.Random* everywhere used the *Random* object is used or,
2. Implicit import: import java.util.Random; or import java.util.\*; at the top of the file.

### Using Classes

Classes can be used with the dot (.) Operator like so:

```java
someClass.someMethod();
someClass.someVariable = someValue;
```

## Making classes

**Enumerated types** are user defined types where all possible values are listed out. For example
```java
enum TypeName { breakfast, lunch, dinner};
enum ClassYear {fr, so, jr, sr};
```

Will produce two new data types with the given values. *ClassYear* can have a value of *fr*, *so*, *jr*, or *sr*. 

**Enumerated Types** are good for creating objects with a **set list of possible values** and can be accessed like this:
```java
ClassYear year = ClassYear.fr;
if(year == fr)
    System.out.println("Freshman");
```

In addition, enum types include their own methods including the *.values()* method which returns a list of possible values the given enum type can hold.

## Common classes

### Random

Random is a pseudo random number generator
Method|Details
------|-------
`float nextFloat()`|Produces a number between 0.0 (inclusive) and 1.0 (exclusive)
`int nextInt()`|Produces any integer, negative, positive, or zero
`int nextInt(int n)`|Produces a number between 0 and n-1 inclusively

```java
Random r = new Random();
System.out.println("Random int:" + r.nextInt());
```

### String

The string class is very useful and allows Java to easily work with words or sets of characters. The string class is contained in the *java.lang* package and is automatically included with every java program. 
Method|Details
------|-------
`char charAt(int index)`|Returns the character at the given index
`int CompareTo(String s)`|Compares two strings
`int indexOf(char c)`|Returns the first index that contains the char c
`int length()`|Returns the length of the string
`String replace(char old, char new)`|Returns a new string that replaces all the old chars with the new ones
`String substring(int index)`|Returns a new string that starts at index to end
`String toLowerCase()`|Returns a new string with all characters lowercase
`String toUpperCase()`|Returns a new string with all characters uppercase
`String trim()`|Trims the string of all trailing whitespace

```java
String s = new String("This is a string!");
String s2 = "This is another!";

System.out.println(s + " " + s2);
```
