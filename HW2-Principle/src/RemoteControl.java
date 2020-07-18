import java.util.Scanner;

public class RemoteControl
{
    Scanner scan = new Scanner(System.in);
    private Shutter shutter;
    public RemoteControl(Shutter shutter)
     {
         this.shutter=shutter;
     }
     public void pressButton()
     {
         System.out.println("Press for button:");
         System.out.println("1-Open");
         System.out.println("2-Close");
         System.out.println("3-System exits");
         int x = scan.nextInt();
         if (x == 1) {
             shutter.open();
         }
         else if(x==3){
             System.exit(0);
         }
         else if(x==2){
             shutter.close();
         }
     }
}
