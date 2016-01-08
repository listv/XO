package listv.xo.controller;

import listv.xo.model.Field;
import listv.xo.model.Figure;
import listv.xo.model.exceptions.AlreadyOccupiedException;
import listv.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {
    public void applyFigure(final Field field, final Point point, final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (null!=field.getFigure(point)){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}