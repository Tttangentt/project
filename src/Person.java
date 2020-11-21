public class Person {
    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name : " + name);
        str.append(" | ");
        str.append("Weight : " + weight);
        return str.toString();
    }
}

