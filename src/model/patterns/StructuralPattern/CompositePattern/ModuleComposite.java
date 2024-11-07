package model.patterns.StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public abstract class ModuleComposite {
    protected List<ModuleComposite> children = new ArrayList<>();

    public void add(ModuleComposite component) {
        children.add(component);
    }

    public void remove(ModuleComposite component) {
        children.remove(component);
    }

    public List<ModuleComposite> getChildren() {
        return children;
    }
}
