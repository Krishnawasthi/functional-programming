# Functional Interfaces in Java 8


<img width="817" height="75" alt="Screenshot 2026-07-28 215301" src="https://github.com/user-attachments/assets/172641bd-8c7b-401f-8132-09537bde82c6" />


Java 8 introduced **Functional Interfaces** and several built-in interfaces in the `java.util.function` package to support lambda expressions and functional programming.

## Predicate

A **Predicate** represents a condition that returns a boolean value.

- Functional Method: `boolean test(T t)`
- Used for filtering, validation, and condition checking.

**Example:**
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
System.out.println(isEven.test(10)); // true
```

---

## Supplier

A **Supplier** provides or generates a value without taking any input.

- Functional Method: `T get()`
- Used for lazy object creation, default values, and random data generation.

**Example:**
```java
Supplier<String> message = () -> "Hello, Java!";
System.out.println(message.get());
```

---

## Summary

| Interface | Input | Output | Purpose |
|-----------|-------|--------|---------|
| Predicate | ✔ | `boolean` | Checks a condition |
| Supplier | ✘ | ✔ | Supplies or generates a value |

<img width="680" height="352" alt="image" src="https://github.com/user-attachments/assets/b9d85ce2-0e0f-41a8-94a1-92debc1ef20a" />


# Consumer



<img width="587" height="127" alt="Screenshot 2026-07-28 220529" src="https://github.com/user-attachments/assets/cf76a6e7-76fd-4e2e-8ec3-55bb0b5309ad" />


A **Consumer** is a functional interface introduced in **Java 8** that accepts **one input** and **does not return any value**.

- **Package:** `java.util.function`
- **Functional Method:** `void accept(T t)`

It is commonly used for printing values, updating objects, or performing operations on data.

## Example

```java
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> print = name -> System.out.println("Hello " + name);

        print.accept("Krishna");
    }
}
```

**Output**
```
Hello Krishna
```

---

## Summary

| Interface | Input | Output | Purpose |
|-----------|-------|--------|---------|
| Consumer | ✔ | ✘ | Performs an operation on the given input |


<img width="1657" height="852" alt="image" src="https://github.com/user-attachments/assets/edee58c4-476f-41ce-8411-d86273c47a1d" />


<img width="447" height="26" alt="image" src="https://github.com/user-attachments/assets/ae0c9cf0-bd3a-4107-96a4-f065e21dd5c2" />


