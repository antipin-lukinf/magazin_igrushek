public class Mishka extends Toy{
    public Mishka(int idToy, String nameToy, int quantity) {
        super(idToy, nameToy, quantity);
        this.setColor(color);
    }
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return String.format("%s - s%", super.toString(), color);
    }
}
