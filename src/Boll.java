public class Boll extends Toy{
    public Boll(int idToy, String nameToy, int quantity, int dropProbability) {
        super(idToy, nameToy, quantity, dropProbability);

    }
    private String view;

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
