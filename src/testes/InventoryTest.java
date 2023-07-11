package src.testes;

import src.Controller.*;
import src.Controller.GamesGUI.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {
    private Inventory inventory;
    private char[][] testWorld;

    @Before
    public void setUp() {
        inventory = new Inventory();

        testWorld = new char[][]{
                {'Z', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
    }


    @Test
    public void testCanCollectInvalidLetter() {
        boolean canCollect = inventory.canCollect(1, 0, testWorld);
        assertFalse(canCollect);
    }

    @Test
    public void testAddLetterToInventory() {
        inventory.addLetterToInventory('A');
        assertEquals(1, inventory.getCollectedItems().size());
        assertEquals('A', (char) inventory.getCollectedItems().get(0));
    }

    @Test
    public void testSetInInventory() {
        inventory.setInInventory("A");
        assertEquals("AA", inventory.getInInventory());
    }

    @Test
    public void testIsInInventory() {
        inventory.setInInventory("A");
        assertTrue(inventory.isInInventory("A"));
    }
}
