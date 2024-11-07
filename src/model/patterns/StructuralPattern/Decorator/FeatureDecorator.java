package model.patterns.StructuralPattern.Decorator;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public abstract class FeatureDecorator extends ModuleComposite {
    protected ModuleComposite module;

    public FeatureDecorator(ModuleComposite module) {
        this.module = module;
    }

    @Override
    public void add(ModuleComposite component) {
        module.add(component);
    }
}
