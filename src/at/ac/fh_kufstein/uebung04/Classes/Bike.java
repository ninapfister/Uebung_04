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

    @Override
    public void accelerate(double geschwindigkeit)
    {
        if((getSpeed()+geschwindigkeit)>getMaxSpeed())
        {
            System.out.println("maxSpeed erreicht");
            setSpeed(getMaxSpeed());
        }
        else
            {
            setSpeed(getSpeed()+geschwindigkeit);
        }
    }

    @Override
    public void slowDown(double geschwindigkeit) {
        if ((getSpeed() - geschwindigkeit) < 0) {
            System.out.println("Bike steht");
            setSpeed(0);

        } else {
            setSpeed(getSpeed() - geschwindigkeit);
        }
    }
}




