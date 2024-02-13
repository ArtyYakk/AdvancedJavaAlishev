import org.example.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D vector2D;
    @BeforeClass
    public static void createNewVector(){
        vector2D = new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, vector2D.length(), EPS);
    }
//
//    @Test
//    public void newVectorShouldHaveZeroX(){
//        Assert.assertEquals(0, vector2D.getX(), EPS);
//    }
//
//    @Test
//    public void newVectorShouldHaveZeroY(){
//        Assert.assertEquals(0, vector2D.getY(), EPS);
//    }

    @Test
    public void newVectorShouldHaveZeroXY(){
        Assert.assertEquals(0, vector2D.getX(), EPS);
        Assert.assertEquals(0, vector2D.getY(), EPS);
    }
}
