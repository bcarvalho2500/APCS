public class personDriver {

    public static void main(String[] args) {
        
        Adult adult1 = new Adult("Mary", 26, 'f', "Teacher", 35000);
        Child child1 = new Child("George", 7, 'm', "Pine Grove Elementary");
        Child child2 = new Child("Sue", 17, 'f', "Eastern Technical High");

        System.out.println(adult1.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
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
        return (super.toString() + " School: " + school);
    }
}