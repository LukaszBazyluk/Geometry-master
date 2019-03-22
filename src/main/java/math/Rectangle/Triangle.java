package math.Rectangle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Triangle {

    private double bokA;
    private double bokB;
    private double wysokosc;
    private double bokC;
    private double podstawa;

    public double PoleTrojkataPodstawaWysokosc(){

        return (podstawa * wysokosc)/2;
    }
}
