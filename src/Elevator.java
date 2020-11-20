public class Elevator {
    private int maximumPerson;
    private int maxFloor;
    private int currentFloor;
    private double maximumWeight;
    private Person[] personInElevator;
    private int pointOfPerson;

    public Elevator(int maximumPerson,int maxFloor,double maximumWeight) {
        this.maximumPerson = Math.max(1,maximumPerson);
        this.maxFloor = Math.max(1,maxFloor);
        this.maximumWeight = Math.max(1,maximumWeight);;
        this.personInElevator = new Person[this.maximumPerson];
        this.currentFloor = (int) (Math.random() * maxFloor) + 1;
    }
}
