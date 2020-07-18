public class Alarm {

    public void Sensor(Sun sun)
    {
        if (sun.getSun()>35)
        {
            System.out.println("Amount of sun is greater than 35.");
            for (int i=0;i <10;i++)
            {
                System.out.println("Waiting time is: " +i);
            }
            System.out.println("The shutter is closed.");
        }
    }
}
