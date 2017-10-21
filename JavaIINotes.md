* File: A sequence of bytes

  * 2 types: Text (ASCII Files), Binary
    * Files that you write and read using an editor are called text files. Binary files represent data in a way that is not convenient to read with a text editor, but that can be written to and read from a program very efficiently.	

* A stream is a flow of data. If the data flows into your program, then the stream is called an input stream. If the data flows out of your program, the stream is called an output stream. Streams are used for both console I/O, which you have been using already, and file I/O.

* The class `PrintWriter` is the preferred stream class for **writing** to a text file. (P617)

  * Opening the file (creating or overwriting):
    * `outputStream = new PrintWriter(new FileOutputStream("stuff.txt"));`
  * Appending to a file (creating or appending):
    * `outputStream = new PrintWriter(new FileOutputStream("stuff.txt", true));`	

* The two most common stream classes used for ***reading*** from a text file are the **Scanner** class and the **BufferedReader** class.

  * Opening a Text File for Reading with **Scanner** (P631):

    * `Scanner inputStream = new Scanner(new FileInputStream("morestuff.txt")); `

  * Checking for the End of a Text File with **Scanner**:

    * `hasNextInt(), hasNextLine()`

  * Opening a Text File for Reading with **BufferReader** (P637):

    * `BufferedReader inputStream = new BufferedReader(new FileReader("morestuff2.txt"));`

  * Checking for the End of a Text File with **BufferReader**:

    * The method `readLine()` of the class BufferedReader returns *null* when it tries to read beyond the end of a text file. 


    * The method `read()` of the class BufferedReader returns -1 when it tries to read beyond the end of a text file.	

* `System.in, System.out, System.err`:

  * `setErr(), setIn(), setOut()` (P643)

* `File` Class (P646):

  * File class constructor takes a name, known as the abstract name, as an (string) argument.