package topics.MTAExam;

public class Reminders {
    public static void main(String[] args) {
//        System.out.println(safeRoot(3,2));
//        System.out.println(safeRoot(3,1));
//        System.out.println(safeRoot(-3,2));
//        System.out.println(safeRoot(-3,1));
//        System.out.println(safeRoot(-3,1.5));
        System.out.println();
        System.out.println(safeRootMiro(3,2));
        System.out.println(safeRootMiro(3,1));
        System.out.println(safeRootMiro(-3,2));
        System.out.println(safeRootMiro(-3,1));
        System.out.println(safeRootMiro(-3,1.5));
    }
//    public static String safeRoot(double d, double i){
//        if (d>=0){return "else";}
//        else{
//            if (i%2==0){return 5d;}
//            else{return 1d;}
//        }
//    }

    public static String safeRootMiro(double d, double i){
        if (d>=0){return "other";} //else this
        else{ // if d is negative and...
            if (i%2==0){return "-,i is even";} //
            else{return "-i is odd";}
        }
    }
}
