public class Elevator {
    private int maximumPerson; //จำนวนคนสูงสุดที่ลิฟต์สามารถรับได้
    private int maxFloor; //จำนวนชั้นสูงสุดที่เรากำหนด
    private int currentFloor; //ชั้นที่เราอยู่ในปัจจุบัน
    private double maximumWeight; //น้ำหนักสูงสุดที่ลิฟต์สามารถรับได้
    private Person[] personInElevator; //เป็น array ไว้สำหรับเก็บ person
    private int pointOfPerson; //คนที่อยู่ในลิฟต์

    public Elevator(int maximumPerson,int maxFloor,double maximumWeight) {
        this.maximumPerson = Math.max(1,maximumPerson);
        this.maxFloor = Math.max(1,maxFloor);
        this.maximumWeight = Math.max(1,maximumWeight);
        this.personInElevator = new Person[this.maximumPerson];
        this.currentFloor = (int) (Math.random() * maxFloor) + 1;
    }

    public void gotoXFloor(int Targetfloor){ //รับค่าชั้นที่เราต้องการ
        // เก็บค่าระยะห่างระหว่างชั้นที่ต้องการไป //ไม่ให้ค่าติดลบ
        int differentFloor = Math.abs(Targetfloor-currentFloor);
        // ป้องกันกดได้ชั้นเดิม
        if(Targetfloor > currentFloor && differentFloor != 0){

            for (int i = 0; i < differentFloor; i++) {
                up(); //ทำงานเพิ่มชั้นจนกว่าจะถึงชั้นที่กด
                System.out.println("Current Floor : " + getCurrentFloor());
            }
        }else if(Targetfloor < currentFloor && differentFloor != 0){
            for (int i = 0; i < differentFloor; i++) {
                down(); //ทำงานเพิ่มชั้นจนกว่าจะถึงชั้นที่กด
                System.out.println("Current Floor : " + getCurrentFloor());
            }
        }else System.out.println("You are already in this floor");
    }

    //เป็น getter return ค่า CurrentFloor ตำแหน่งชั้นที่เราอยู่
    public int getCurrentFloor(){
        return currentFloor;
    }

    //เป็น method ที่ทำให้ลิฟต์ขึ้น
    public void up(){
        if(currentFloor<maxFloor)
            this.currentFloor++;
    }

    //เป็น method ที่ทำให้ลิฟต์ลง
    public void down(){
        if(currentFloor>1)
            this.currentFloor--;
    }

    //เป็น getter ที่ return ค่า MaxFloor จำนวนชั้นที่เรากำหนด
    public int getMaxFloor() {
        return maxFloor;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("== Elevator ==\n");

        str.append("Current Floor : "+currentFloor);
        str.append("\nMax Floor : "+maxFloor);

        str.append("\nMax Person : "+ maximumPerson);
        str.append("\nMax Weight : "+ maximumWeight);

        if(pointOfPerson>0){
            for (int i = 0; i < pointOfPerson; i++) {
                //แสดง ข้อมูลของคนที่อยู่ในลิฟต์             แสดงชื่อและน้ำหนัก
                str.append("\nPerson #"+(i+1)+" : "+personInElevator[i]);
            }
        }else {
            str.append("\nNo Person in this Elevator");
        }

        str.append("\n==============");
        return str.toString();
    }
}
