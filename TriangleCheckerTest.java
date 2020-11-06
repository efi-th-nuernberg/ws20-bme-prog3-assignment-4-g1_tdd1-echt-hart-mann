import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);
    }

    @Test
    public void testEquilateralTriangle() {
        // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }

    @Test
    public void testNoneTriangleNegativeA() {
        // Arrange
        float a = -6;
        float b = 4;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleNegativeB() {
        // Arrange
        float a = 3;
        float b = -4;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleNegativeC() {
        // Arrange
        float a = 3;
        float b = 4;
        float c = -5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleOverlangA() {
        // Arrange
        float a = 3;
        float b = -4;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleOverlongA() {
        // Arrange
        float a = 10;
        float b = 4;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleOverlongB() {
        // Arrange
        float a = 10;
        float b = 100;
        float c = 1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleOverlongC() {
        // Arrange
        float a = 1;
        float b = 10;
        float c = 20;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNoneTriangleZero() {
        // Arrange
        float a = 0;
        float b = 0;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testIsoscelesTriangleA() {
        // Arrange
        float a = 5;
        float b = 10;
        float c = 10;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleB() {
        // Arrange
        float a = 10;
        float b = 5;
        float c = 10;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleC() {
        // Arrange
        float a = 10;
        float b = 10;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }
}
