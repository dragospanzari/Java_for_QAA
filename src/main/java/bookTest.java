public class bookTest {
    public static void main(String[] args) {
        book[] carte = new book[3];
        carte[0]= new book("20000 Leghe sub mari", "1151", "Jules Verne", "Nemira" );
        carte[1]= new book("Insula Misterioasa", "1157", "Jules Verne", "Adevarul");
        carte[2]= new book("800 Leghe pe Amazon", "1160", "Jules Verne", "Adevarul");

        carte[0].getBookInfo();
        carte[1].getBookInfo();
        carte[2].getBookInfo();

    }
}
