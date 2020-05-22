public class MyOwnAutoShop {
    public static void main(String[] args) {

        Truck myTruck1 = new Truck (220, 59000, "Blue", 1999);
        Truck myTruck2 = new Truck (260, 109000, "Black", 6000);
        Ford myFord = new Ford(260,18500,"Silver", 500);
        Sedan mySedan1 = new Sedan (210, 14999, "White", 20);
        Sedan mySedan2 = new Sedan (290, 34009, "Red", 25);
        Car myCar = new Car(160, 6000,"Yellow");

        System.out.println("Truck 1 regular price: " + myTruck1.regularPrice + " EURO. New Price after discount: "+ myTruck1.getSalePrice() + " EURO");
        System.out.println("Truck 2 regular price: " + myTruck2.regularPrice + " EURO. New Price after discount: "+ myTruck2.getSalePrice() + " EURO");
        System.out.println("Ford regular price: " + myFord.regularPrice + " EURO. New Price after discount: "+ myFord.getSalePrice() + " EURO");
        System.out.println("Sedan 1 regular price: " + mySedan1.regularPrice + " EURO. New Price after discount: "+ mySedan1.getSalePrice() + " EURO");
        System.out.println("Sedan 2 regular price: " + mySedan2.regularPrice + " EURO. New Price after discount: "+ mySedan2.getSalePrice() + " EURO");
        System.out.println("My Car price: "+ myCar.getSalePrice() + " EURO");
    }
}
