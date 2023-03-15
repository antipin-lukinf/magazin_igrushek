public class Car extends Toy{
    public Car(int idToy, String nameToy, int quantity, int dropProbability, String body) {
        super(idToy, nameToy, quantity, dropProbability);
        this.body = body;
    }
    private String body;

    @Override
    public String toString() {
        return String.format(super.toString(), body);
    }
}
