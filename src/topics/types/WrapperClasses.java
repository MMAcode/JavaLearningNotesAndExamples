package topics.types;

public class WrapperClasses {
    public static void main(String[] args) {
        int i = 7;

        Integer ii = Integer.valueOf(i);
        // Integer ii2 = new Integer(7);  - less performant -> redundant

        int i2 = ii.intValue();


        //auto
        int i3 = ii; //=autoUnboxing
        Integer ii3 = i; //=autoBoxing
    }
}
