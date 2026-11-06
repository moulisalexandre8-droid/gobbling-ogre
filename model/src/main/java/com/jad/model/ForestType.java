package com.jad.model;

import java.util.Random;

public enum ForestType {
    RECTANGULAR(new RectangularForestFactory()),
    HORIZONTALLY_MAGIC(new HorizontallyMagicForestFactory()),
    VERTICALLY_MAGIC(new VerticallyMagicForestFactory()),
    FULLY_MAGIC(new FullyMagicForestFactory());

    private final AbstractForestFactory factory;

    ForestType(final AbstractForestFactory factory) {
        this.factory = factory;
    }

    public IForest create(final int width, final int height, final double density, final Random random) {
        return this.factory.create(width, height, density, random);
    }
}
