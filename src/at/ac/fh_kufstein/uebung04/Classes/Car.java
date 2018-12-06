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

    public Car (String color, int wheels, double speed)
    {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }
}

