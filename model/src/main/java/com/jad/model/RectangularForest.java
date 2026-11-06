package com.jad.model;

public final class RectangularForest extends AbstractForest {

    public RectangularForest(final Tile[][] tiles) {
        super(tiles);
    }

    @Override
    protected int resolveX(final int x) {
        return this.clip(x, this.getWidth());
    }

    @Override
    protected int resolveY(final int y) {
        return this.clip(y, this.getHeight());
    }
}
