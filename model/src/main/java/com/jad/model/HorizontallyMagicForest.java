package com.jad.model;

public final class HorizontallyMagicForest extends AbstractForest {

    public HorizontallyMagicForest(final Tile[][] tiles) {
        super(tiles);
    }

    @Override
    protected int resolveX(final int x) {
        return this.wrap(x, this.getWidth());
    }

    @Override
    protected int resolveY(final int y) {
        return this.clip(y, this.getHeight());
    }
}
