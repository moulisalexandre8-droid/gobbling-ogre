package com.jad.model;

public final class FullyMagicForestFactory extends AbstractForestFactory {

    @Override
    protected boolean bordersLeftAndRight() {
        return false;
    }

    @Override
    protected boolean bordersTopAndBottom() {
        return false;
    }

    @Override
    protected IForest build(final Tile[][] tiles) {
        return new FullyMagicForest(tiles);
    }
}
