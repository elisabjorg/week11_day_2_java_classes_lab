import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();

    }

    public void addPassenger(Person person){
        this.passengers.add(person);
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public boolean underCapacity(){
        if(countPassengers()<=this.capacity){
            return true;
        }
        return false;
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePerson();
        this.addPassenger(person);
    }
}
