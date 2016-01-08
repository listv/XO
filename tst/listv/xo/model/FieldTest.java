package listv.xo.model;

import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;

public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final int expectedValue=Field.FIELD_SIZE;

        final Field field=new Field();
        final int actualValue=field.getSize();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testGetFigure() throws Exception {

    }

    @Test
    public void testSetFigure() throws Exception {
        final Point inputPoint=new Point(0,0);
        final Field field=new Field();
        final Figure inputFigure=Figure.O;
        final Figure expectedFigure=inputFigure;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure=field.getFigure(inputPoint);

        assertEquals(expectedFigure, actualFigure);
    }
}