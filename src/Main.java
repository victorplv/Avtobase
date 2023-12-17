

public class Main {
    public static void main(String[] args) {
        Route route1 = new Route(); // Конструктор без парамметров
        route1.Print();
        Route route2 = new Route(true, 10, true, 123, "лада", "седан", true, 123, true, 123  );
        route2.Print();             // Конструктор с парамметрами
        route2.BanDriver();
        route2.driver.GetRequest();
        }
    }
