# Minis
Minis is a set of time-saving functions written in Java designed for re-usability for reducing programming effort, allowing you to concentrate on the bigger part!
# Motive
There have been scenarios where developers working on huge projects find the smaller, easier yet time-intensive-to-code and pretty generic, portions of code quite annoying. I hope this repository grows to be a dev's close friend to do away with the programming effort related to smaller and quite generic code snippets such as reading and writing to files and for instance formatting date and time well. Features can be added to such functions for versatality in the long run!
# Incorporation
Minis can be incorporated by adding this as an Eclipse/ADT project in your Android application or directly as a module in your Java project (with reference to IntelliJ's IDEA). For other IDEs, say you use Notepad (just kidding) - clone down the src/Minis.java into your project. Just copy past, that's it!
```java
Minis minis = new Minis();
```
That should get you kicking.
# Documentation
* `public boolean write(File file, String s)`
  * Writes a string to a file
  * Parameters
    * `String s` - input string
    * `File file` - target file to write to
  * Returns
    * `true` - indicates successful write
    * `false` - indicates an `IOException` caught
* `public String read(File file)`
  * Reads the entire file (supports multi-line files) as a string
  * Paramaters
    * `File file` - input file to read from
  * Returns
    * A string if no exception
    * `null` if `IOException` is caught
* `public String formatDate(String date, String delimiter)`
  * Perfectly formats dates as shown
    * 23_7_2017 (delimiter : _) as 23-JUL-2017
    * 3.10.97 (delimiter : .) as 3-OCT-97
    * ...
  * Parameters
    * `String date` - an input date of a given format
    * `String delimiter` - pattern separating date components as seen in the above examples
  * Returns
    * A formatted date string
* `public String formatTime(String time, String delimiter)`
  * Perfectly formats time as shown
    * 18_0 (delimiter : _) as 6:00 PM
    * 3.52 (delimiter : .) as 3:52 AM
    * ...
  * Parameters
    * `String time` - an input time of a given format
    * `String delimiter` - pattern separating time components as seen in the above examples
  * Returns
    * A formatted time string
