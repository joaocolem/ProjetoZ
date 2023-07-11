package src.testes;

import src.Controller.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class WorldTest {
    private World world;

    @BeforeEach
    void setUp() {
        char[][] map = {
                {'#', '#', '#'},
                {'#', ' ', '#'},
                {'#', '#', '#'}
        };

        world = new World(map);
    }

    @Test
    void testGetMap() {
        char[][] expectedMap = {
                {'#', '#', '#'},
                {'#', ' ', '#'},
                {'#', '#', '#'}
        };

        assertArrayEquals(expectedMap, world.getMap());
    }

    @Test
    void testGetPortals() {
        List<Portal> portals = world.getPortals();
        assertNotNull(portals);
        assertEquals(0, portals.size());
    }

    @Test
    void testAddPortal() {
        Portal portal = new Portal(1, 1, 2, 2, 1);

        world.addPortal(portal);

        List<Portal> portals = world.getPortals();
        assertNotNull(portals);
        assertEquals(1, portals.size());
        assertEquals(portal, portals.get(0));
    }

    @Test
    void testIsValidMove_ValidMove() {
        assertTrue(world.isValidMove(1, 1));
    }

    @Test
    void testIsValidMove_InvalidMove_OutOfBounds() {
        assertFalse(world.isValidMove(10, 10));
    }

    @Test
    void testIsValidMove_InvalidMove_Barrier() {
        assertFalse(world.isValidMove(0, 0));
    }

    @Test
    void testUpdateWorld() {
        world.updateWorld(1, 1, '&');

        char[][] expectedMap = {
                {'#', '#', '#'},
                {'#', '&', '#'},
                {'#', '#', '#'}
        };

        assertArrayEquals(expectedMap, world.getMap());
    }


    @Test
    void testGetFirstWorld() {
        World result = World.getFirstWorld();

        assertNotNull(result);
        assertEquals(world, result);
    }
}
