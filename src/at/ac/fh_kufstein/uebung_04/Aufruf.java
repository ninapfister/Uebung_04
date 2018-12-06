package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf
{
    public static void main (String []args)
    {
        Car auto1 = new Car("rot", 4, 200.0 );

        auto1.currentSpeed();
    }
}
