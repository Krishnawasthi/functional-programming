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
