package listv.xo.controller;

import listv.xo.model.Field;
import listv.xo.model.Figure;
import org.junit.Test;

import java.awt.*;
import java.util.Random;

import static junit.framework.TestCase.*;

public class CurrentMoveControllerTest {

    @Test
    public void testCurrentMoveWhenNextMoveIsO() throws Exception {
        final CurrentMoveController currentMoveController=new CurrentMoveController();
        for(int i=0;i<3; i++) {
            final Field field=new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.O, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNextMoveIsX() throws Exception {
        final CurrentMoveController currentMoveController=new CurrentMoveController();
        for(int i=0;i<3; i++) {
            final Field field=new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            assertEquals(Figure.X, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNoNextMove() throws Exception {
        final CurrentMoveController currentMoveController=new CurrentMoveController();
        final Field field=new Field(3);
        final Random rnd=new Random();
        for(int i=0;i<field.getSize(); i++) {
            for(int j=0;j<field.getSize();j++) {
                field.setFigure(new Point(i,j), 0==rnd.nextInt(2)%2?Figure.O:Figure.X);
            }
        }
        assertNull(currentMoveController.currentMove(field));
    }
}