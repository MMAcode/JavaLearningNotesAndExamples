package topics;

import static helpers.StaticHelpers.p;

public class ScopesOfVariables {
    static int i=1;
    static class StaticClass{
        public static int i =3;

        public static void main(String[] args) {
            p("3) "+ i);
            int i = 4;
            p("4) "+ i);
            p("5) "+ ScopesOfVariables.i); //multiple static/instance variables can exists together

        }
    }
    public static void main(String[] args) {
        p("a) "+ i);
        int i=2;
        if(i>0){
            // int i=3; //2 local variables can't exist together
            p("b) "+i);
        }
    }
}
