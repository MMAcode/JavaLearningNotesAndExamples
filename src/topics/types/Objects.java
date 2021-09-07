package topics.types;

public class Objects {
    public static void main(String[] args) {
        Object o = new Object();

    }

    @Override
    protected void finalize(){
        System.out.println("ahoj");
    }
}
