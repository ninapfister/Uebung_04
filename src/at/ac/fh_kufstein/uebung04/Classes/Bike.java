package at.ac.fh_kufstein.uebung04.Classes;

public class Bike extends Car
{

    public Bike(String color, int wheels, double speed, double maxSpeed)
    {
        super(color, wheels, speed);
        this.maxSpeed = maxSpeed;
    }

    double maxSpeed;

    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }



}




