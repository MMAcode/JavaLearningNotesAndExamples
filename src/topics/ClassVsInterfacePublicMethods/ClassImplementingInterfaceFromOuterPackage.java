package topics.ClassVsInterfacePublicMethods;

public class ClassImplementingInterfaceFromOuterPackage implements SomeInterface {

    @Override
    public void greetToBePublic() {

    }

    @Override
    // private void greetToBePrivate() {  --> NOT possible
    public void greetToBePrivate() {

    }
}
