
public class Shutter {

    private boolean open;
    public Shutter()
    {
        this.open= false;
    }
    public void open() {
        System.out.println("The shutter opens.");
        open = true;

    }
    public void close() {
        System.out.println("The shutter closes.");
        open = false;
    }
    public void lock(){

        System.out.println("The shutter is locked.");
        open=false;
        System.exit(0);
    }
    public boolean isOpen() {
        return open;
    }
}
