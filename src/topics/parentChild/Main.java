package topics.parentChild;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.getAge();
        System.out.println(c.age);
        Parent p = c;
        p.getAge(); //child's method activated here -> child's props used
        System.out.println(p.age);

    // conclusion: if child casted to parent and method called, method of the child is used.
        // If method is accessing properties, if child's method is activated, it will acess child's properties (if child class has that property);
        // if parent method was activated, it will access parent's properties.
    }
}
