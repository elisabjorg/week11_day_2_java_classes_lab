import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Glasgow");
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1,busStop.countPeople());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1,busStop.countPeople());
    }


}
