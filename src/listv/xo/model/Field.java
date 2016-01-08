package listv.xo.model;

import listv.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class Field {
    public static final int MIN_COORDINATE = 0;

    private final Figure[][] field;

    private final int fieldSize;

    public Field(int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize];
    }

    public int getSize(){
        return fieldSize;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!isCorrectPoint(point)){
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException {
        if (!isCorrectPoint(point)){
            throw new InvalidPointException();
        }
        field[point.x][point.y]=figure;
    }

    private boolean isCorrectPoint(final Point point) {
        return isCorrectCoordinate(point.x, field.length) && isCorrectCoordinate(point.y, field[point.x].length);
    }

    private boolean isCorrectCoordinate(final int coordinate, final int maxCoordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }
}
