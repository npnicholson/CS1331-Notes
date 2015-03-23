# Recursion

Recursion is the process of calling a method from within itself.

```java
int m1(int a) {
    // stuff
    x = m1(a-1);
}
```

This is not "calling yourself", rather a new method is produced and added to the method stack. Without a **terminating condition**, the recursive process will run forever. To make recursion to work, you need **base cases** to go with the recursive calls (these stop the self-calling).

```java
public static factorial (int n) {
    if (n == 0)
        return 1;
    else
        return (n * factorial(n-1));
}
```

Given that the above code was given an initial n value of 3, the following would occur:

|iteration|value of n|return|
|---------|----------|------|
|0|3|**6**|
|1|2|2|
|2|1|1|
|3|0|1|

Because the method works from top down, and then back up the return column, the final return value is **6**.

### Towers of Hanoi

This recursive problem requires movement of rings from one peg to another, given three total pegs, but the rings can never be stacked with a larger one on top of a smaller one. To do this, the following number of iterations are required:

```java
H(n) = H(n-1) + 1 + H(n-1)
```
The following is an example of this problem:

```java
void towersOfHanoi(int numdisks) {
    moveTower(int numdisks, 1, 3, 2);
}

void moveTower(int num, int start, int end, int temp) {
    moveTower(int num-1, start, tmp, end);
    moveOne(start, end);
    moveTower(int num-1, tmp, end, start);
}

void moveOne(int start, int end) {
    // Moves a disk from start to end
    System.out.println("Moving from " + start " + to " + end ".");
}
```

This results in an iteration count of 2^n -1.

### Sorting

Sorting is another good use for recursion. Merge sort splits the list in half again and again until it is broken down, then it puts it back together in order.

```java
mergeSort(int[] arr) {
    n = arr.length;
    myMerger(arr,0,n-1);
}

void myMerger(int[] arr, int start, int end) {
    if(start == end)
        return;
    else if (start == end - 1) {
        if(arr[sart] <= arr[end])
            //swap the two
    } else {
        mid = (end - start) / 2;
        myMerger(arr, beg, mid);
        myMerger(arr, mid+1, end);
        combine(arr, start, mid, end);
    }
}
```

O = nlog(n)

### Fibonacci Numbers

F(n) = F(n-1) + F(n-2)
    F(1) = 1, F(2) = 1;

```java
int fib(int n) {
    if (n == 1 || n == 2)
        return 1;
    else
        return fib(n-1) + fib(n-2);
}
