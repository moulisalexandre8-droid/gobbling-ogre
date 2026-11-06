package com.jad;

import com.jad.controller.Controller;
import com.jad.controller.IController;
import com.jad.model.ForestType;
import com.jad.model.IForest;
import com.jad.model.Model;
import com.jad.view.IView;
import com.jad.view.View;

import java.util.Random;

public enum Main {
    ;

    // Paramètres du programme : à régler ici
    private static final ForestType FOREST_TYPE = ForestType.VERTICALLY_MAGIC;
    private static final int FOREST_WIDTH = 40;
    private static final int FOREST_HEIGHT = 10;
    private static final double TREE_DENSITY = 0.1;

    public static void main(String[] args) {
        final IForest forest = FOREST_TYPE.create(FOREST_WIDTH, FOREST_HEIGHT, TREE_DENSITY, new Random());

        Model model = new Model(forest);
        IView view = new View(model);
        IController controller = new Controller(model, view);
        controller.proceed();
    }
}
