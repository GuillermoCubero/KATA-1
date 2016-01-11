package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata1 {

    public static void main(String[] args) {             
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(1995,7,14);
        
        Person persona = new Person("Guillermo", "Cubero", birthday);
        
        System.out.println(persona.getFullName() + " tiene " + persona.getAge() + " años.");
    }
}
