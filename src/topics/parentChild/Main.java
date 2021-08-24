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
        //

        System.out.println("age2:");
        c.getAge2();
        p.getAge2();
        // if child is casted to parent and child doesn't override parent's method,
        // parent's method will be implemented and therefore also parent's property will be used.

        /**
         * Summary: Avoid duplicating properties on child class; instead use/update properties of parent class.
         */

    //
    }
}
