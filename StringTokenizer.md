# String Tokenizer

```java
String s,w;
StringTokenizer tokens = new StringTokenizer(s);
while(tokens.hasMoreTokens()) {
    w = tokens.nextToken();
    // do something
}
```

You can also pass charactors to serve as tokens:

```java
StringTokenizer tokens2 = new StringTokenizer(s," \n.;?!:");
// Any of those charactors will act as tokens
```

You can also pass **Scanner** a string:
```java
Scanner scan = new Scanner(s);
while(scan.hasNExt()) {
    s.o.p(scan.next());
}
```
```java
scan.useDelimiter("chars");
```

