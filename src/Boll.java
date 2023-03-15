public class Boll extends Toy{
    public Boll(int idToy, String nameToy, int quantity, int dropProbability, String view) {
        super(idToy, nameToy, quantity, dropProbability);
        this.view = view;
    }
    private String view;

    @Override
    public String toString() {
        return String.format(super.toString(), view);
    }
}
