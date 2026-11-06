package com.jad.model;

public final class HorizontallyMagicForestFactory extends AbstractForestFactory {

    @Override
    protected boolean bordersLeftAndRight() {
        return false;
    }

    @Override
    protected boolean bordersTopAndBottom() {
        return true;
    }

    @Override
    protected IForest build(final Tile[][] tiles) {
        return new HorizontallyMagicForest(tiles);
    }
}
