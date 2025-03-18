import java.util.*;

class Elevator {
    private int currentFloor;
    private int maxFloors;
    private int maxPassengers;
    private Queue<Integer> requests;
    private Map<Integer, Integer> callFrequency;

    public Elevator(int maxFloors, int maxPassengers) {
        this.currentFloor = 1;
        this.maxFloors = maxFloors;
        this.maxPassengers = maxPassengers;
        this.requests = new LinkedList<>();
        this.callFrequency = new HashMap<>();
        for (int i = 1; i <= maxFloors; i++) {
            callFrequency.put(i, 0);
        }
    }

    public void callElevator(int floor) {
        if (floor < 1 || floor > maxFloors) {
            throw new IllegalArgumentException("Invalid floor number");
        }
        requests.add(floor);
        callFrequency.put(floor, callFrequency.get(floor) + 1);
    }

    public void processRequests() {
        int totalTime = 0;
        while (!requests.isEmpty()) {
            int nextFloor = requests.poll();
            int timeToMove = Math.abs(nextFloor - currentFloor);
            totalTime += timeToMove;
            currentFloor = nextFloor;
            System.out.println("Elevator moved to floor " + currentFloor + " in " + timeToMove + " seconds.");
        }
        System.out.println("Total time taken: " + totalTime + " seconds.");
    }

    public void displayCallFrequency() {
        System.out.println("Call frequency per floor:");
        for (Map.Entry<Integer, Integer> entry : callFrequency.entrySet()) {
            System.out.println("Floor " + entry.getKey() + ": " + entry.getValue() + " calls");
        }
    }
}

public class ElevatorSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of floors: ");
        int maxFloors = scanner.nextInt();
        System.out.print("Enter maximum passengers per trip: ");
        int maxPassengers = scanner.nextInt();
        System.out.print("Enter simulation duration (in seconds): ");
        int duration = scanner.nextInt();

        Elevator elevator = new Elevator(maxFloors, maxPassengers);
        Random random = new Random();

        for (int i = 0; i < duration; i++) {
            int callFloor = random.nextInt(maxFloors) + 1;
            elevator.callElevator(callFloor);
        }

        elevator.processRequests();
        elevator.displayCallFrequency();
    }
}