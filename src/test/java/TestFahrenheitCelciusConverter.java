import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFahrenheitCelciusConverter {
    private static final double DELTA = 0.1;
    double degree;
    double result;
    FahrenheitCelciusConverter conv=new FahrenheitCelciusConverter();

    @Test
    public void toCelciusLessThan0() {
        degree=-95.6;
        result=conv.toCelcius(degree);
        Assert.assertEquals(result,-70.88,DELTA);


    }

    @Test
    public void toFahrenheitLessThan0() {
        degree=-100;
        result=conv.toFahrenheit(degree);
        Assert.assertEquals(result,-148,DELTA);

    }

    @Test
    public void toFahrenheitGreaterThan0() {
        degree=45.45;
        result=conv.toFahrenheit(degree);
        Assert.assertEquals(result,113.81,DELTA);

    }
    @Test
    public void toCelciusGreaterThan0() {
        degree=879;
        result=conv.toCelcius(degree);
        Assert.assertEquals(result,470.55,DELTA);


    }
    @Test
    public void toCommonPointFromCelcius(){
        degree=-40;
        FahrenheitCelciusConverter conv=new FahrenheitCelciusConverter();
        result=conv.toFahrenheit(degree);
        Assert.assertEquals(result,-40,DELTA);
    }

    @Test
    public void toCommonPointFromFahreinheit(){
        degree=-40;
        result=conv.toCelcius(degree);
        Assert.assertEquals(result,-40,DELTA);
    }
}