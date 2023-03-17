public class Car extends Toy{
    public Car(int idToy, String nameToy, int quantity, int dropProbability) {
        super(idToy, nameToy, quantity, dropProbability);

    }
    private String body;

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
