


public class Main {
    public static void main(String[] args) {
        Route route1 = new Route(); // Конструктор без парамметров
        route1.Print();
        Route route2 = new Route(true, 10, true, 123, "лада", "седан", true, 123, true, 123  );
        route2.Print();             // Конструктор с парамметрами
        route2.BanDriver();
        route2.driver.GetRequest();
        route2.car.PrintMarkUp();


        Route route3 = new Route(){
          public int GetEnd(){
              int end;
              Route x = new Route();
              x.SetEnd(11);
              System.out.print("Такая же оценка, но немного другая\n");
              end = x.GetEnd();
              return end;
          }

        };
        route3.GetEnd();
        route1.ScoreTrip(2);
        route1.ScoreTrip(1);

        int i;
        Route[] route = new Route[5];
        route[0] = new Route();
        route[1] = new Route();
        route[2] = new Route();
        route[3] = new Route();
        route[4] = new Route();
        for (i=0; i<route.length; i++)
        {
            route[i].SetEnd(i+1);
            if (route[i].GetEnd()== 5) System.out.println("Ура! Оценка 5");
        }
        }

    }
