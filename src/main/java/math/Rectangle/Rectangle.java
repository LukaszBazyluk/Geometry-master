package math.Rectangle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.rmi.MarshalException;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle {

    private double bokA;
    private double bokB;
    private double przekatna;


    public double getField(){
        return bokA * bokB;
    }

    public double getDiagonal(){
        return  Math.sqrt(bokA * bokA) + Math.sqrt(bokB * bokB);
    }
    public double getCircuit(){

        return bokA*2 + bokB*2;
    }
}
