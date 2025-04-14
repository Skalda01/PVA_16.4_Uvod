import org.junit.Before;
import org.junit.Test;
import uvod.Enemy;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import test.TestClass;

public class TestUvod {
    private TestClass testClass;

    @Before
    public void setUp() {
        testClass = new TestClass();
    }

    @Test
    public void testDistanceToObject() {
        int result = testClass.TestDistanceToObject();
        assertEquals(20, result);
    }

    @Test
    public void testIsAlive() {
        boolean result = testClass.TestIsAlive();
        assertEquals(false, result);
    }

    @Test
    public void testEnemyListSize() {
        int result = testClass.TestEnemyListSize();
        assertEquals(5, result);
    }

    @Test
    public void testEnemyListElement() {
        boolean result = testClass.TestEnemyListElement();
        assertEquals(false, result);
    }

    @Test
    public void testAddEnemy() {
        Enemy result = testClass.TestAddEnemy();
        assertEquals("Enemy_F", result.getName());
    }

    @Test
    public void testRemoveEnemy() {
        Enemy result = testClass.TestRemoveEnemy();
        assertEquals("Enemy_C", result.getName());
    }

    @Test
    public void testSameCoordinates() {
        Enemy result = testClass.TestSameCoordinates();
        assertEquals("Enemy_B", result.getName());
    }

    @Test
    public void testRemoveEnemyCollision() {
        ArrayList<Enemy> expected = testClass.getEnemyList();
        ArrayList<Enemy> result = testClass.TestRemoveEnemyCollision();

        expected.remove(1);

        System.out.println(expected.size());
        System.out.println(result.size());
        assertEquals(expected, result);
    }

    @Test
    public void testReturnArrayListObject() {
        ArrayList<uvod.Entita> result = testClass.TestReturnArrayListObject();
        assertEquals(4, result.size());
    }

  
    
    

  
}
