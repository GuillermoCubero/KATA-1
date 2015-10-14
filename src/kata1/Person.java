package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {

    private final String name;
    private final String surname;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) getMillis(today.getTimeInMillis() - birthday.getTimeInMillis()); 
    }
    
    private long getMillis(long milli){
        return milli / MILLISECONDS_PER_YEAR;
    }
}