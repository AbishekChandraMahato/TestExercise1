import java.math.BigDecimal;
import java.math.RoundingMode;

public class FahrenheitCelciusConverter {
    private double degree;
    private double newDegree;


    public double toCelcius(double fahrenheit){

        degree=((fahrenheit-32)*5/9);
        newDegree =roundDegrees(degree);
        return newDegree;

    }
    public double toFahrenheit(double Celcius){
        degree=(((Celcius*9/5)+32));
        newDegree=roundDegrees(degree);
        return newDegree;

    }

    public static double roundDegrees(double x){
        BigDecimal bd = new BigDecimal(x);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();


    }
}
