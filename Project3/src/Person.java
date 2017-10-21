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

    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            Person otherPerson = (Person) otherObject;
            return (name.equals(otherPerson.name) && id == otherPerson.id);
        }
    }

    public String toString() {
        return ("name: " + name + "\nid: " + id);
    }
}