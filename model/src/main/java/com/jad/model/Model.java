package com.jad.model;

public class Model implements IModel {

    private final IForest forest;

    public Model(final IForest forest) {
        this.forest = forest;
    }

    public IForest getForest() {
        return this.forest;
    }
}
