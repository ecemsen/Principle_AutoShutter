import java.util.Scanner;

public class shutterTest {
    public static void main(String[] args) {
        LightSensitiveSensor sensor = new LightSensitiveSensor();
        Shutter shutter = new Shutter();
        Scanner scan = new Scanner(System.in);
        RemoteControl rc = new RemoteControl(shutter);
        Alarm alarm = new Alarm();
        boolean runProgram = true;
        int time=(int)(Math.random()*24);

       if(time<9) {
            while (runProgram) {
                System.out.println("System is working.");
                Sun sun = new Sun();
                if (sensor.Sensor(sun) == true) {
                    alarm.Sensor(sun);

                } else {
                    for (int i=0;i<4;i++)
                    rc.pressButton();
                }
            }
        }
       else {
           System.out.println("Time is: " +time);
           shutter.lock();
       }
    }
}
