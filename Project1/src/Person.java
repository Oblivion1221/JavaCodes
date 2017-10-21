// Yaoxian Yang
// COSC 211 (Fall 2017)
// Section: 12:00 ~ 13:50 Tue, Thu
// This program is for Programming assignment #1
// Person class has 2 instance variables: name and id
// 3 constructors: default constructor, parameterized constructor and copy constructor
// It also has getters and setters for name and id
// and equals(), toString() method

public class Person {
    private String name;
    private int id;

    public Person() {                               // default constructor
        name = "";
        id = 0;
    }

    public Person(String newName, int newId) {      // parameterized constructor
        name = newName;
        id = newId;
    }

    public Person(Person otherPerson) {             // copy constructor
        name = otherPerson.name;
        id = otherPerson.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setName(Person p, String newName) {
        p.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setId(Person p, int newId) {
        p.id = newId;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Person otherPerson) {
        return (name.equals(otherPerson.name) && id == otherPerson.id);
    }

    public String toString() {
        return ("name = " + name + " id = " + id);
    }
}
