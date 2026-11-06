package com.jad.model;

import java.util.Optional;

public abstract class AbstractForest implements IForest {

    private final Tile[][] tiles; // [y][x]

    protected AbstractForest(final Tile[][] tiles) {
        this.tiles = tiles;
    }

    /** Colonne réelle correspondant à x, ou -1 si x est hors de la forêt. */
    protected abstract int resolveX(int x);

    /** Ligne réelle correspondant à y, ou -1 si y est hors de la forêt. */
    protected abstract int resolveY(int y);

    @Override
    public int getWidth() {
        return this.tiles[0].length;
    }

    @Override
    public int getHeight() {
        return this.tiles.length;
    }

    @Override
    public Optional<Tile> getTile(final int x, final int y) {
        final int realX = this.resolveX(x);
        final int realY = this.resolveY(y);
        if (realX < 0 || realY < 0) {
            return Optional.empty();
        }
        return Optional.of(this.tiles[realY][realX]);
    }

    /** Bord normal : hors limites => -1. */
    protected final int clip(final int value, final int size) {
        return (value >= 0 && value < size) ? value : -1;
    }

    /** Bord magique : on réapparaît de l'autre côté. */
    protected final int wrap(final int value, final int size) {
        return Math.floorMod(value, size);
    }
}
