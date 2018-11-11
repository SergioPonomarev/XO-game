package io.spono.xo.controllers;

import io.spono.xo.model.Field;
import io.spono.xo.model.Figure;
import io.spono.xo.model.exceptions.AlreadyOccupiedException;
import io.spono.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure)
            throws AlreadyOccupiedException, InvalidPointException {

        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
