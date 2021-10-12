# java17

Java JDK SE 17 was released on September 14, 2021 as an LTS release.

## What is LTS?

* LTS stands for Long Term Support.
* LTS releases focuse on stability, security and performance improvements - not new features.
* Reduces the risk that an update can break existing code that uses the release.
* Previous LTS release was Java SE 11.
* Current cadence is a new LTS every 3 years
* Oracle proposed shifting cadence every 2 years instead
* Non LTS release cadence is 6 months
  * Java 18 in 6 months
  * Java 19 in 12 months 
  * etc.

## What is new in Java 17

* Records
  * Classes that act as transparent carriers for immutable data
  * Includes an accessor for each component with the same name and return type that returns exactly the component's value (or the API doesn't model the state)
  * Includes an accessible constructor whose parameter list matches the components
  * Includes methods such as `equals`, `hashCode` and `toString`
  * Cleaner and less code
  * https://nipafx.dev/java-record-semantics/
  * https://openjdk.java.net/jeps/395

  ```
  curl localhost:9080/customer | jq .
  ```


* Text Blocks
  * Adding JSON snippets or multi line SQL queries is much easier thanks to textt blocks.
  * No need to add escape characters, new line characters or concatenation
  * https://openjdk.java.net/jeps/378
   ```
   curl localhost:9080/movies | jq .
   ```

   ```
   curl localhost:9080/html
   ```

   ```
   curl localhost:9080/sql
   ```
   
 * Helpful NPEs (null pointer exceptions)
   * Shows which variable is null
   * Previously null pointer exceptions were ambiguous
   * Introduced in Java 14 
   * https://openjdk.java.net/jeps/358 
   
   ```
   curl localhost:9080/fullname
   curl localhost:9080/npe
   ```