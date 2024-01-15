
public class Driver implements Info {
    private boolean request;
    private int id;

    public Driver()
    {
         request= false;
         id = 0;
    }
    public Driver(boolean request, int id)
    {
        this.request = request;
        this.id = id;
    }

    public void SetId(int id){
        this.id = id;
    }
    public void SetRequest(boolean request){
        this.request = request;
    }
    public void GetId(){
        System.out.printf("ID водителя: %d\n", id );
    }
    public void GetRequest()
    {
        if(request){
            System.out.print("Водитель в поездке\n");
        } else {
            System.out.print("Водитель не в поездке\n");
    }
    }
    public String toString()
    {
        System.out.print("Информация о водителе\n");
        return "Статус: "+request+", Номер водителя: "+id;
    }


    @Override
    public void ShowInfo() {
        System.out.print("Я водитель, я везу\n");
    }
}
