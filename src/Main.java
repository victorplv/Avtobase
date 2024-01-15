


public class Main {
    public static void main(String[] args) {
        Route route1 = new Route(); // Конструктор без парамметров
        route1.Print();
        Route route2 = new Route(true, 10, true, 123, "лада", "седан", true, 123, true, 123  );

        route1.D.func();
        route1.disp.func();
        route1.D.SetPay(123);
        route1.D = new GlavDisp(true, 123, 10000);

        route1.driver = new Driver(true, 321);
        System.out.println(route1.driver);

        route1.NR.road();
        route2.UR.road();

        route1.disp.ShowInfo();
        route1.driver.ShowInfo();

        // Копирование объектов
        Route route3 = new Route(route2.GetStatus(), route2.GetEnd());
        route3.Print();
        System.out.print("\n");



        };
}

