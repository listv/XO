package listv.xo.model;

import listv.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.*;
//import static junit.framework.TestCase.assertNull;
//import static junit.framework.TestCase.fail;

public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final int expectedValue=Field.FIELD_SIZE;

        final Field field=new Field();
        final int actualValue=field.getSize();
        assertEquals(actualValue, expectedValue);
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

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Point inputPoint=new Point(0,0);
        final Field field=new Field();

        final Figure actualFigure=field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Point inputPoint=new Point(-1,0);
        final Field field=new Field();

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }

    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Point inputPoint=new Point(0,-1);
        final Field field=new Field();

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }


    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {
        final Field field=new Field();
        final Point inputPoint=new Point(field.getSize()+1,0);

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }

    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {
        final Field field=new Field();
        final Point inputPoint=new Point(0, field.getSize()+1);

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }

    @Test
    public void testGetFigureWhenXAndYAreLessThenZero() throws Exception {
        final Field field=new Field();
        final Point inputPoint=new Point(-1, -1);

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }

    @Test
    public void testGetFigureWhenXAndYAreGreaterThenSize() throws Exception {
        final Field field=new Field();
        final Point inputPoint=new Point(field.getSize()+1, field.getSize()+1);

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (InvalidPointException e){}
    }
}