public class Mishka extends Toy{
    public Mishka(int idToy, String nameToy, int quantity, int dropProbability) {
        super(idToy, nameToy, quantity, dropProbability);

    }

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
