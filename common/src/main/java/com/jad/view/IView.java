package com.jad.view;

import com.jad.controller.IController;

public interface IView {
    void setController(IController controller);

    /** Redessine l'affichage à partir de l'état actuel du modèle. */
    void refresh();
}
