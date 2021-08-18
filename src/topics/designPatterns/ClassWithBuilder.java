package topics.designPatterns;

public class ClassWithBuilder {
    private final int number, nr2,nr3;
    private final String str1, str2, str3;

    private ClassWithBuilder(Builder b) {
        this.number = b.number;
        this.nr2 = b.nr2;
        this.nr3 = b.nr3;
        this.str1 = b.str1;
        this.str2 = b.str2;
        this.str3 = b.str3;
    }
    //
    @Override
    public String toString() {
        return "ClassWithBuilder{" +
                "number=" + number +
                ", nr2=" + nr2 +
                ", nr3=" + nr3 +
                ", str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", str3='" + str3 + '\'' +
                '}';
    }

    public static class Builder{
        int number, nr2,nr3;
        String str1, str2, str3;

        public Builder(int number) {
            this.number = number;
        }
        public Builder nr2(int n){
            this.nr2 = n;
            return this;
        }

        public Builder str2(String str2) {
            this.str2 = str2;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }


        public Builder nr3(int nr3) {
            this.nr3 = nr3;
            return this;
        }

        public Builder str1(String str1) {
            this.str1 = str1;
            return this;
        }

        public Builder setStr3(String str3) {
            this.str3 = str3;
            return this;
        }

        public ClassWithBuilder build(){
            return new ClassWithBuilder(this);
        }
    }
}
