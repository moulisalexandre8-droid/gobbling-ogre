package com.jad.view;

import com.jad.controller.IController;
import com.jad.model.IForest;
import com.jad.model.Model;
import com.jad.model.Tile;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;

import java.awt.*;

public class View implements IView {
    private static final String TITLE = "Ogre Boulotteur";

    private final Model model;
    private IController controller;
    private TextWindow window;

    public View(final Model model) {
        this.model = model;
    }

    private static char toChar(final Tile tile) {
        return switch (tile) {
            case EMPTY -> ' ';
            case OAK -> 'O';
            case ACACIA -> 'A';
            case FIR -> 'F';
        };
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void refresh() {
        final IForest forest = this.model.getForest();
        if (this.window == null) {
            this.window = this.createWindow(forest);
        }
        this.window.display(this.render(forest));
    }

    private String render(final IForest forest) {
        final StringBuilder builder = new StringBuilder();
        for (int y = 0; y < forest.getHeight(); y++) {
            for (int x = 0; x < forest.getWidth(); x++) {
                builder.append(forest.getTile(x, y).map(View::toChar).orElse(' '));
            }
            builder.append('\n');
        }
        return builder.toString();
    }

    private TextWindow createWindow(final IForest forest) {
        final TextWindowSettings settings = new TextWindowSettings();
        settings.setTitle(TITLE);
        settings.setScreenDimension(new Dimension(forest.getWidth(), forest.getHeight()));
        final TextWindow textWindow = new TextWindow(settings);
        textWindow.setVisible(true);
        return textWindow;
    }
}
