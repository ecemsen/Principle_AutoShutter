public class LightSensitiveSensor
{
    public boolean Sensor(Sun sun)
    {
        Shutter shutter=new Shutter();
        System.out.println("Sun amount is " + sun.getSun()+ " ");
        if (sun.getSun()>35)
        {
            return true;
        }
        return false;
    }
}

