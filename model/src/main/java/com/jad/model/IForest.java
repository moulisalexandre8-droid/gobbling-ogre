package com.jad.model;

import java.util.Optional;

public interface IForest {

    int getWidth();

    int getHeight();

    /** Retourne la case en (x, y), ou Optional.empty() si on est hors de la forêt. */
    Optional<Tile> getTile(int x, int y);
}
