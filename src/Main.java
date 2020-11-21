import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Max Floor : ");  // กำหนดค่าของ maxFloor
        int maxFloor = sc.nextInt();
        System.out.print("Insert Max Person : "); // กำหนดค่าของ maxPerson
        int maxPerson = sc.nextInt();
        System.out.print("Insert Max Weight : "); // กำหนดค่าของ maxWeight
        double maxWeight = sc.nextDouble();

        Elevator elevator = new Elevator(maxPerson, maxFloor, maxWeight);
        System.out.println(elevator);   // ให้แสดงค่า status ของ elevator
        int num = 0;
        while (num==0){
            Menu.getMenu(); // เรียกใช้ method getMenu() จาก class Menu
            int selectedMenu = sc.nextInt();
            switch (selectedMenu){
                case 1 :
                    System.out.println("---- Elevator Status ----");    // เรียกดูค่า status ของ elevator
                    System.out.println(elevator);
                    break;
                case 2 :
                    System.out.println("---- Add Person ----"); // เป็นการเพิ่ม person เข้าไปในลิฟต์
                    System.out.print("Input Person name : ");   // กำหนดชื่อของ person
                    String name = sc.next();
                    System.out.print("Input Person Weight : "); // กำหนดน้ำหนักของ person
                    double weight = sc.nextDouble();

                    Person person = new Person(name, weight);
                    elevator.addPerson(person);                 // เรียกใช้ method addPerson() จาก class Elevator
                    System.out.println(elevator);
                    break;
                case 3:
                    System.out.println("---- Goto Target Floor ----");  // เป็นการเลือกชั้นที่เราต้องการจะไป
                    // เรียกใช้ getCurrentFloor เพื่อดูว่าตอนนี้เราอยู่ชั้นอะไร        // เรียกใช้ getMaxFloor เพื่อดูว่ามีชั้นทั้งหมดชั้น
                    System.out.println("Now You're on #" + elevator.getCurrentFloor() + " Floor Of "+elevator.getMaxFloor()+ " Floor");
                    System.out.print("Input Target Floor : ");  // เลือกชั้นที่เราต้องการจะไป และเก็บไว้ใน targetFloor
                    int targetFloor = sc.nextInt();
                    elevator.gotoXFloor(targetFloor);   // เรียกใช้ method gotoXFloor จาก class Elevator
                    System.out.println(elevator);
                    break;
                case 4:
                    num = 1;
                    System.out.println("---- Thank You ----");
                    break;
            }
        }
    }
}
