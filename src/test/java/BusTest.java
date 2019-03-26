import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {


    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("New York",50);
        person = new Person();
        busStop = new BusStop("Edinburgh");
    }

    @Test
    public void countPassengers(){
        bus.addPassenger(person);
        assertEquals(1,bus.countPassengers());
    }

    @Test
    public void canAddPassengerFalse(){
        Bus testBus = new Bus("Idaho",3);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        assertEquals(false,testBus.underCapacity());
    }
    @Test
    public void canAddPassengerTrue(){
        Bus testBus = new Bus("Alabama",4);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        assertEquals(true,testBus.underCapacity());
    }
    @Test
    public void canRemovePassenger(){
        Bus testBus = new Bus("Chicago",34);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.removePassenger();
        assertEquals(3,testBus.countPassengers());

    }
    @Test
    public void canPickUpPersonFromBusStop(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(1,bus.countPassengers());
        assertEquals(2,busStop.countPeople());
    }

}


