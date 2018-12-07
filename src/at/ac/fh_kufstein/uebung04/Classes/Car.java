package at.ac.fh_kufstein.uebung04.Classes;

public class Car
{
    String color;
    int wheels;
    double speed;



    public void currentSpeed()
    {
        System.out.println(" Die Geschwindigkeit beträgt " + this.speed);
    }

    public Car()
    {

    }

    public Car (String color, int wheels, double speed)
    {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    public String getColor ()
    {
        return color;
    }

    public int getWheels ()
    {
        return wheels;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void accelerate(double geschwindigkeit)
    {
        this.speed = this.speed+geschwindigkeit;
        System.out.println(speed);
    }

    public void slowdown(double geschwindigkeit)
    {
        this.speed = this.speed-geschwindigkeit;
        System.out.println(speed);
    }
}

