package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung04.Classes.Bike;
import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf
{
    public static void main (String []args)
    {
        Car auto1 = new Car("rot", 4, 200.0 );

        auto1.currentSpeed();

        auto1.accelerate(60.0);
        auto1.currentSpeed();

        auto1.slowdown(60.0);
        auto1.currentSpeed();

        Bike bike1 = new Bike ("blau", 2, 20,40);
        bike1.accelerate(10.0);
        bike1.currentSpeed();

        Bike bike2 = new Bike("yellow", 2, 20, 40);
        bike2.accelerate(100);
        bike2.slowDown(100);
        bike2.currentSpeed();

    }
}
