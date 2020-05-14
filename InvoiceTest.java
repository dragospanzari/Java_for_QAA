class Invoice {
    String part_number;
    String part_description;
    int quantity;
    double item_price;

    public Invoice(String part, String description, int count, double price) {
        part_number = part;
        part_description = description;
        quantity = count;
        item_price = price;
    }

    public void setNumber(String part) {
        part_number = part;
    }

    public String getNumber() {
        return part_number;
    }

    public void setDescription(String description) {
        part_description = description;
    }

    public String getDescription() {
        return part_description;
    }

    public void setQuantity(int count) {
        quantity = count;
        if (count < 0)
            quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        item_price = price;
        if (price < 0)
            item_price = 0;
    }

    public double getPrice() {
        return item_price;
    }

    public double getInvoiceAmount()
    {
        return item_price*quantity;
    }
}

public class InvoiceTest {
    public static void main(String[] args)
    {
        Invoice inv1 = new Invoice("3569", "Caramizi BCA", 300, 9.99);
        Invoice inv2 = new Invoice("7843", "Caramizi BCA slim", 100, 4.99);
        Invoice inv3 = new Invoice("123", "Fier beton", 500, 10.12);

         double total = inv1.getInvoiceAmount()+inv2.getInvoiceAmount()+inv3.getInvoiceAmount();
         double tva = total*0.16;

        System.out.println("Factura 1569/3914 din 14.05.2020");
        System.out.println(inv1.getNumber() + "\t" + inv1.getDescription() + "\t" + inv1.getQuantity() + "\t" + inv1.getPrice() + "\t Total: " + inv1.getInvoiceAmount());
        System.out.println(inv2.getNumber() + "\t" + inv2.getDescription() + "\t" + inv2.getQuantity() + "\t" + inv2.getPrice() + "\t Total: " + inv2.getInvoiceAmount());
        System.out.println(inv3.getNumber() + "\t" + inv3.getDescription() + "\t" + inv3.getQuantity() + "\t" + inv3.getPrice() + "\t Total: " + inv3.getInvoiceAmount());
        System.out.println("Total factura: " + total + "lei, din care TVA:" + tva + "lei");
    }
}
