package listv.xo.model;

import listv.xo.model.exceptions.AlreadyOccupiedException;
import listv.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class Field {
    public static final int FIELD_SIZE = 3;
    public static final int MIN_COORDINATE = 0;
    public static final int MAX_COORDINATE = FIELD_SIZE;

    private final Figure[][] field=new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!isCorrectPoint(point)){
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (!isCorrectPoint(point)){
            throw new InvalidPointException();
        }
        if (null!=field[point.x][point.y]){
            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y]=figure;
    }

    private boolean isCorrectPoint(final Point point) {
        return isCorrectCoordinate(point.x) && isCorrectCoordinate(point.y);
    }

    private boolean isCorrectCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }
}
