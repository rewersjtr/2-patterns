public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        TemparatureDisplay display1 = new TemparatureDisplay("Display 1");
        TemparatureDisplay display2 = new TemparatureDisplay("Display 2");

        station.addObserver(display1);
        station.addObserver(display2);

        System.out.println("Temperature Update: 22");
        station.setTemperature(22);

        System.out.println("Temperature Update: 30");
        station.setTemperature(30);
    }
}