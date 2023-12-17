public class Dispatcher {
    private int id;
    private boolean statusD;

    public Dispatcher()
    {
        statusD= false;
        id = 0;
    }
    public Dispatcher(boolean statusD, int id)
    {
        this.statusD = statusD;
        this.id = id;
    }

    public void SetId(int id){
        this.id = id;
    }
    public void SetStatusD(boolean statusD){
        this.statusD = statusD;
    }
    public void GetId(){
        System.out.printf("ID диспетчера: %d\n", id );
    }
    public void GetRequest(){
        if(statusD){
            System.out.print("Диспетчер занят\n");
        } else {
            System.out.print("Диспетчер свободен\n");
        }
    }
}
