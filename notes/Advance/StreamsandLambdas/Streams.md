### Streams
Stream is an API used to process collection effectively by using multiple operations in a chained manner.

### How to create a Stream?
1. Collection

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

List<Integer> li = Arrays.asList(1, 2, 3, 4);
Stream<Integer> si=li.stream();
```

2. Arrays

```java
import java.util.Arrays;
import java.util.stream.Stream;

int[] a = new int[]{1, 2, 3, 4};
Stream<Integer> sa = Arrays.stream(a);
```

3. Stream.of

```java
import java.util.stream.Stream;

Stream<String> ss=Stream.of("A","B","C","D");
```

### Different operations in streams
- Intermediate (In between):These operations return back a stream.
  - `filter()`
  - `sorted()`
  - `map()`
  - `distinct()`
- Terminal (end):These operations doesn't return back a stream.
  - `forEach()`
  - `findFirst()`
  - `collect()`
  - `count()`