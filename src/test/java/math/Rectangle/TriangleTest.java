package math.Rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testPolePodstawaWysokosc(){
        //given
        Triangle triangle = new Triangle();
        //when
        triangle.setPodstawa(5);
        triangle.setWysokosc(10);
        //then
        assertEquals(Double.valueOf(25),Double.valueOf(triangle.PoleTrojkataPodstawaWysokosc()));
    }

}