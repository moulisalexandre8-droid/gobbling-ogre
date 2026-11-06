package com.jad.model;

import java.util.Random;

public abstract class AbstractForestFactory {

    public static final int MIN_SIZE = 3;

    public final IForest create(final int width, final int height, final double density, final Random random) {
        if (width < MIN_SIZE || height < MIN_SIZE) {
            throw new IllegalArgumentException("La forêt doit faire au moins " + MIN_SIZE + "x" + MIN_SIZE);
        }
        if (density < 0 || density > 1) {
            throw new IllegalArgumentException("La densité doit être comprise entre 0 et 1");
        }
        final Tile[][] tiles = new Tile[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final boolean border = (this.bordersLeftAndRight() && (x == 0 || x == width - 1))
                                       || (this.bordersTopAndBottom() && (y == 0 || y == height - 1));
                tiles[y][x] = (border || random.nextDouble() < density) ? Tile.randomTree(random) : Tile.EMPTY;
            }
        }
        return this.build(tiles);
    }

    /** true si les bords gauche et droit sont bordés d'arbres (non magiques). */
    protected abstract boolean bordersLeftAndRight();

    /** true si les bords haut et bas sont bordés d'arbres (non magiques). */
    protected abstract boolean bordersTopAndBottom();

    /** Construit la forêt de la bonne forme à partir de la grille générée. */
    protected abstract IForest build(Tile[][] tiles);
}
