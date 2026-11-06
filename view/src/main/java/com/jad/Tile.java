package com.jad;

public enum Tile {
    EMPTY(true),
    CHENE(false),
    ACACIA(false),
    SAPIN(false);

    private final boolean passable;

    Tile(boolean passable) {
        this.passable = passable;
    }

    public boolean getPassable() {
        return passable;
    }
}



