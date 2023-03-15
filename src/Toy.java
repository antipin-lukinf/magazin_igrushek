public abstract class Toy {
    private  int idToy;
    private String nameToy;
    private int quantity;
    private int dropProbability;

    public Toy(int idToy, String nameToy, int quantity, int dropProbability) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantity = quantity;
        this.dropProbability = dropProbability;
    }

    public int getDropProbability() {
        return dropProbability;
    }

    public void setDropProbability(int dropProbability) {
        this.dropProbability = dropProbability;
    }

    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "idToy=" + idToy +
                ", nameToy='" + nameToy + '\'' +
                ", quantity=" + quantity + '\'' +
                ", dropProbability" + dropProbability +
                '}';
    }
}
