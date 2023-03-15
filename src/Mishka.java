public class Mishka extends Toy{
    public Mishka(int idToy, String nameToy, int quantity, int dropProbability, String color) {
        super(idToy, nameToy, quantity, dropProbability);
        this.color = color;
    }
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return String.format(super.toString(), color);
    }
}
