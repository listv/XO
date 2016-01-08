package listv.xo.model;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class GameTest {

    @Test
    public void testGetPlayers() throws Exception {
        final Player[] inputPlayers=new Player[]{new Player("Sasha", Figure.X), new Player("Grisha", Figure.O)};
        final Field inputField=new Field();
        final String inputName="Game1";
        final Game game=new Game(inputPlayers, inputField, inputName);
        final Player[] expectedPlayers=inputPlayers;

        final Player[] actualPlayers=game.getPlayers();

        assertEquals(expectedPlayers, actualPlayers);
    }

    @Test
    public void testGetField() throws Exception {
        final Player[] inputPlayers=new Player[]{new Player("Sasha", Figure.X), new Player("Grisha", Figure.O)};
        final Field inputField=new Field();
        final String inputName="Game1";
        final Game game=new Game(inputPlayers, inputField, inputName);
        final Field expectedField=inputField;

        final Field actualField=game.getField();

        assertEquals(expectedField, actualField);
    }

    @Test
    public void testGetName() throws Exception {

    }
}