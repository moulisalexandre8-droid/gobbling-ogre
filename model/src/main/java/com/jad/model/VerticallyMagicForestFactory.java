package com.jad.model;

public final class VerticallyMagicForestFactory extends AbstractForestFactory {

    @Override
    protected boolean bordersLeftAndRight() {
        return true;
    }

    @Override
    protected boolean bordersTopAndBottom() {
        return false;
    }

    @Override
    protected IForest build(final Tile[][] tiles) {
        return new VerticallyMagicForest(tiles);
    }
}
