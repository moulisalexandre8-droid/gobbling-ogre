package com.jad.model;

public final class FullyMagicForest extends AbstractForest {

    public FullyMagicForest(final Tile[][] tiles) {
        super(tiles);
    }

    @Override
    protected int resolveX(final int x) {
        return this.wrap(x, this.getWidth());
    }

    @Override
    protected int resolveY(final int y) {
        return this.wrap(y, this.getHeight());
    }
}
