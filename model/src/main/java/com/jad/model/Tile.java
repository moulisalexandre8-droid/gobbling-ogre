package com.jad.model;

import java.util.Random;

/**
 * Contenu possible d'une case de la forêt.
 * Aucune information d'affichage ici : c'est la vue qui choisit comment dessiner chaque case.
 */
public enum Tile {
    EMPTY(false),
    OAK(true),
    ACACIA(true),
    FIR(true);

    private static final Tile[] TREES = {OAK, ACACIA, FIR};

    private final boolean tree;

    Tile(final boolean tree) {
        this.tree = tree;
    }

    public boolean isTree() {
        return this.tree;
    }

    /** Les arbres sont infranchissables. */
    public boolean isTraversable() {
        return !this.tree;
    }

    /** Retourne un type d'arbre au hasard. */
    public static Tile randomTree(final Random random) {
        return TREES[random.nextInt(TREES.length)];
    }
}
