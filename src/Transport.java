public abstract class Transport {
    private int  ID;
    private double productionYear;
    private String colour;
    private int number;

    public Transport(int ID, double productionYear, String colour, int number) {
        this.ID = ID;
        this.productionYear = productionYear;
        this.colour = colour;
        this.number = number;
    }
    public abstract void run();
    public abstract void stop();
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(double productionYear) {
        this.productionYear = productionYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "ID='" + ID + '\'' +
                ", productionYear=" + productionYear +
                ", colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
