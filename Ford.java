public class Ford extends Car{
    int weight;
    int manufacturerDiscount;

    public Ford (int speed, double regularPrice, String color, int manufacturerDiscount) {
        super (speed, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturerDiscount);
    }

}
