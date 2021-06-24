package topics.types;

public class StringPool {
    public static void main(String[] args) {
        String s1="ahoj";
        String s2="ahoj";
        String s3= new String("ahoj");
        String s4=s3.intern(); //add s4 into the stringPool if match doesn't exist in there already, and returns reference to that stringPool object
        System.out.println(s4==s1);
        System.out.println(s2==s1);
        System.out.println(s3==s1);
        System.out.println(s3==s4);
    }
}
