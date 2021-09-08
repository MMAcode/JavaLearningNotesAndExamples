package topics.designPatterns.usage;

import topics.designPatterns.StatePattern;

public class StatePatternUsage {
    public static void main(String[] args) {

       StatePattern.SpecificContext c = new StatePattern.SpecificContext();
        c.printState();
        c.doSth2();
        c.printState();

    }
}
