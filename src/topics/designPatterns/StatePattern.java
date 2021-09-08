package topics.designPatterns;

public class StatePattern {

    private interface StateInterface {
        void printState();
        void doSth2();
    }

    private static class SpecificState1 implements StateInterface {

        SpecificContext c;
        private SpecificState1(SpecificContext c){
            this.c = c;
        }

        @Override
        public void printState() {
            System.out.println("I am SpecificState1");
        }

        @Override
        public void doSth2() {
            c.changeState(new SpecificState2(c));
        }
    }

    private static class SpecificState2 implements StateInterface {

        SpecificContext c;
        private SpecificState2(SpecificContext c){
            this.c = c;
        }

        @Override
        public void printState() {
            System.out.println("I am SpecificState2");
        }

        @Override
        public void doSth2() {
            c.changeState(new SpecificState1(c));
        }
    }

    public static class SpecificContext implements StateInterface {

        private StateInterface contextState;
        public StateInterface getContextState() {
            return contextState;
        }

        public SpecificContext(){
            contextState = new SpecificState1(this);
        }

        public void changeState(StateInterface s){
            contextState = s;

        }

        @Override
        public void printState() {
            contextState.printState();
        }

        @Override
        public void doSth2() {
            contextState.doSth2();
        }
    }


}
