package model.patterns.StructuralPattern.Decorator;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class CertificateDecorator extends FeatureDecorator {
    public CertificateDecorator(ModuleComposite module) {
        super(module);
    }

    @Override
    public String toString() {
        return module.toString() + " with Certificate";
    }
}
