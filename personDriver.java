public class personDriver {

    public static void main(String[] args) {
        
    }
}

class Person {
    protected String name;
    protected int age;
    protected char gender;

    public Person(String n, int a, char g) {
        name = n;
        age = a;
        gender = g;
    }

    public String toString() {
        return ("Name: " + name + " Age: " + age + " Gender: " + gender);
    }
}

class Adult extends Person {
    private String job;
    private double salary;

    public Adult(String n, int a, char g, String j, double s) {
        super(n, a, g);
        job = j;
        salary = s;
    }

    public String toString() {
        return (super.toString() + " Job: " + job + " Salary: " + salary);    
    }   
}

class Child extends Person {
    private String school;

    public Child(String n, int a, char g, String s) {
        super(n, a, g);
        school = s;
    }

    public String toString() {
        return (super.toString() + " School " + school);
    }
}