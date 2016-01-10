package listv.xo.controller;

import listv.xo.model.Field;
import listv.xo.model.Figure;
import listv.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {

    public Figure currentMove(final Field field) {
        int countFigure = 0;
        for (int i = 0; i < field.getSize(); i++) {
            countFigure += countFigureInTheRow(field, i);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (0 == countFigure % 2)
            return Figure.X;

        return Figure.O;
    }

    private int countFigureInTheRow(final Field field, final int row) {
        int countFigure = 0;
        for (int i = 0; i < field.getSize(); i++) {
            try {
                if (null != field.getFigure(new Point(row, i))) {
                    countFigure++;
                }
            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }
}
