package topics.designPatterns.usage;

import topics.designPatterns.StatePattern_PassingContextInStatesConstructor;

public class StatePatternUsage {
    public static void main(String[] args) {

       StatePattern_PassingContextInStatesConstructor.SpecificContext c = new StatePattern_PassingContextInStatesConstructor.SpecificContext();
        c.printState();
        c.doSth2();
        c.printState();

    }
}
