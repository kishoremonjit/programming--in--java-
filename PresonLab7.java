// Base class
class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class
class Teacher extends Person {
    String subject;
    double salary;

    void displayTeacher() {
        display(); // Call base class method
        System.out.println("Subject: " + subject + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "John";
        t.age = 40;
        t.subject = "Physics";
        t.salary = 60000;
        t.displayTeacher();
    }
}

