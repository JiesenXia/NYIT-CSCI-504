public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Doe", 25);

        if (person1.equals(person2)) {
            System.out.println("Person1 and person2 are equal.");
        } else {
            System.out.println("Person1 and person2 are not equal.");
        }

        Person person3 = new Person("John Doe", 30);

        if (person1.equals(person3)) {
            System.out.println("Person1 and person3 are equal.");
        } else {
            System.out.println("Person1 and person3 are not equal.");
        }
    }
}
