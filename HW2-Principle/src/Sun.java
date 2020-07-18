public class Sun {
    private int sun;
    public Sun ()
    {
        this.sun = (int)(Math.random()*40+20);
    }

    public int getSun()
    {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }
}

