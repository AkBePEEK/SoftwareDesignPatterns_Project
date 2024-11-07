package model.patterns.StructuralPattern.Decorator;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class QuizDecorator extends FeatureDecorator {
    public QuizDecorator(ModuleComposite module) {
        super(module);
    }

    @Override
    public String toString() {
        return module.toString() + " with Quiz";
    }
}
