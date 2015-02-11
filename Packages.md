# Packages

Packages are bits of code that can be **Imported** into a Java program for use. To import a package use this:

```java
import package.thing.stuff;
// or
import package.*
```

# Javadoc

Javadoc automatically produces HTML documentation based on the comments you put in your program. It woll document public classes, methods, instances and static variables. It must follow these rules:
1. Immediately precede public objects
2. Start with /** and end with **/

Use the **@** sign as a tag to give details about material:
1. @param describes a peram (@param paramName someDescription)
2. @return describes what a metod returns (@return descriptionOfTheReturn)
3. @throws Exception
4. @deprecated (was in an earlier version and it still present)
5. @see
6. @author
7. @version

run:
```java
javadoc -d <Dir> *.java
```
