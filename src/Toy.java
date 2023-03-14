public abstract class Toy {
    private  int idToy;
    private String nameToy;
    private int quantity;

    public Toy(int idToy, String nameToy, int quantity) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantity = quantity;
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
                ", quantity=" + quantity +
                '}';
    }
}
