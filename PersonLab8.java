// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
}

// Derived class
class Employee extends Person {
    int empId;

    Employee(String name, int age, int empId) {
        super(name, age); // Call Person constructor
        this.empId = empId;
        System.out.println("Employee constructor called");
    }
}

// Derived class from Employee
class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, String dept) {
        super(name, age, empId); // Call Employee constructor
        this.department = dept;
        System.out.println("Manager constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age +
                ", EmpID: " + empId + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Alice", 35, 101, "Sales");
        m.display();
    }
}
