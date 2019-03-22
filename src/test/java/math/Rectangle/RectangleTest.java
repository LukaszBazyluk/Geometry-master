package math.Rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testField() {
        //given
        Rectangle rectangle = new Rectangle();
        //when
        rectangle.setBokA(5);
        rectangle.setBokB(4);
        //then
        assertEquals(Double.valueOf(20), Double.valueOf(rectangle.getField()));

    }
    @Test
    public void testDiagonal(){
        //given
        Rectangle rectangle = new Rectangle();
        //when
        rectangle.setBokA(5);
        rectangle.setBokB(4);
        //then
        assertEquals(Double.valueOf(9), Double.valueOf(rectangle.getDiagonal()));
    }

    @Test
    public void testCircuit(){
        //given
        Rectangle rectangle = new Rectangle();
        //when
        rectangle.setBokA(5);
        rectangle.setBokB(4);
        //then
        assertEquals(Double.valueOf(18), Double.valueOf(rectangle.getCircuit()));
    }
}