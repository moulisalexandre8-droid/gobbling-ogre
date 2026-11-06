package com.jad.model;

public final class RectangularForestFactory extends AbstractForestFactory {

    @Override
    protected boolean bordersLeftAndRight() {
        return true;
    }

    @Override
    protected boolean bordersTopAndBottom() {
        return true;
    }

    @Override
    protected IForest build(final Tile[][] tiles) {
        return new RectangularForest(tiles);
    }
}
