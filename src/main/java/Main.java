public class Main {
    public static void main(String[] args) {
        FahrenheitCelciusConverter conv=new FahrenheitCelciusConverter();
        System.out.println(conv.toCelcius(100));
        System.out.println(conv.toFahrenheit(52.8));

    }
}
