package com.jad.model;

public final class VerticallyMagicForest extends AbstractForest {

    public VerticallyMagicForest(final Tile[][] tiles) {
        super(tiles);
    }

    @Override
    protected int resolveX(final int x) {
        return this.clip(x, this.getWidth());
    }

    @Override
    protected int resolveY(final int y) {
        return this.wrap(y, this.getHeight());
    }
}
