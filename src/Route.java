public class Route {
    private boolean status;
    private int end;
    Driver driver = new Driver();
    Dispatcher disp = new Dispatcher();
    Car car = new Car();

    public Route(){
        this.status = false;
        this.end = 0;
    }
    public Route(boolean status, int end, boolean cOper, int cId, String mark, String type, boolean reqD, int dId, boolean statD, int dispID ){
        this.status = status;
        this.end = end;
        driver = new Driver(reqD, dId);
        disp = new Dispatcher(statD, dispID);
        car = new Car(cOper, cId, mark, type);
    }
    public void SetStatus(boolean status){
        this.status = status;
    }
    public void SetEnd(int end){
        this.end = end;
    }
    public int GetEnd(){
        return end;
    }
    public void GetStatus(){
        if(status){
            System.out.print("Поездка в процессе либо закончена\n");
        } else {
            System.out.print("Поездка не началась, либо не существует\n");
        }
    }
    public void BanDriver(){
        driver.SetRequest(false);
        System.out.print("Водитель отстранен\n");
    }
    public void RepairCar(){
        car.SetOper(false);
        System.out.print("Автомобилю требуется ремонт\n");
    }
    public void Print(){
        GetEnd();
        GetStatus();
        car.GetId();
        car.GetRequest();
        car.CarC.GetType();
        car.CarC.GetMark();
        driver.GetId();
        driver.GetRequest();
    }
    public void ScoreTrip(int end){
        try{
            if(end<0) throw new ArithmeticException();
            this.end = end;
            System.out.println("Установлена новая оценка поездки!");
        }catch (ArithmeticException exception){
            System.out.println("Оценка не может быть меньше нуля!!!");
        }
    }




}
