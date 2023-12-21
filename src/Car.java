public class Car {

    public static int Wheels = 4;
    private boolean operability;
    private int carId;

    public class CarCard{
        private String type;
        private String mark;
        public CarCard(String mark, String type){
            this.mark = mark;
            this.type = type;
        }
        public CarCard(){
            this.type = " ";
            this.mark = " ";
        }
        public void SetType(String type){
            this.type = type;
        }
        public void SetMark(String mark){
            this.mark = mark;
        }
        public void GetType(){
            System.out.printf("Тип автомобиля: %s\n", type );
        }
        public void GetMark(){
            System.out.printf("Марка автомобиля: %s\n", mark );
        }
    }
    CarCard CarC = new CarCard();

    public Car()
    {
        operability = false;
        carId = 0;
    }
    public Car(boolean operability, int carId, String mark, String type)
    {
        this.operability = operability;
        this.carId = carId;
        CarC = new CarCard(mark, type);
    }

    public void SetOper(boolean operability){
        this.operability = operability;
    }
    public void SetId(int carId){
        this.carId = carId;
    }
    public void GetId(){
        System.out.printf("ID автомобиля: %d\n", carId );
    }
    public void GetRequest(){
        if(operability){
            System.out.print("Автомобиль в порядке\n");
        } else {
            System.out.print("Автомобиль нуждается в ремонте\n");
        }
    }
    static public int GetWheels(){
        return Wheels;
    }
    void PrintMarkUp(){
        this.CarC.mark = this.CarC.mark.toUpperCase();
        System.out.println("Верхний регистр");
        System.out.println(this.CarC.mark);
    }

}
