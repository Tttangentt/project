public class Person {
    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name; //เก็บชื่อ
        this.weight = weight; //เก็บน้ำหนัก
    }

    public double getWeight() {
        return weight;
    } //เรียกดูน้ำหนักของ Person

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name : " + name);
        str.append(" | ");
        str.append("Weight : " + weight);
        return str.toString();
    }
}

