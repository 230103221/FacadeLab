package task09;

public class Main {
    public static void main(String[] args) {
        MemberValidator validator = new MemberValidator();
        CatalogService catalog = new CatalogService();
        FineCalculator fines = new FineCalculator();
        LoanRecorder recorder = new LoanRecorder();


        LibraryCheckoutFacade library = new LibraryCheckoutFacade(validator, catalog, fines, recorder);


        library.borrowBook("STU-01", "ISBN-111");
        System.out.println();


        library.borrowBook("STU-01", "ISBN-111");
        System.out.println();


        library.borrowBook("STU-02", "ISBN-222");
        System.out.println();


        library.borrowBook("STU-99", "ISBN-222");
        System.out.println();


        library.returnBook("STU-01", "ISBN-111");
        System.out.println();
        library.borrowBook("STU-01", "ISBN-111");
    }
}