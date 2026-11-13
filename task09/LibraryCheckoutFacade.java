package task09;

public class LibraryCheckoutFacade {
    private MemberValidator memberValidator;
    private CatalogService catalogService;
    private FineCalculator fineCalculator;
    private LoanRecorder loanRecorder;

    public LibraryCheckoutFacade(MemberValidator memberValidator, CatalogService catalogService,
                                 FineCalculator fineCalculator, LoanRecorder loanRecorder) {
        this.memberValidator = memberValidator;
        this.catalogService = catalogService;
        this.fineCalculator = fineCalculator;
        this.loanRecorder = loanRecorder;
    }

    public boolean borrowBook(String studentId, String isbn) {
        System.out.println("--- Checkout Request: Student " + studentId + " for " + isbn + " ---");

        if (!memberValidator.isActive(studentId)) {
            System.out.println("Checkout denied: Student ID " + studentId + " is not active.");
            return false;
        }

        double fine = fineCalculator.getUnpaidFines(studentId);
        if (fine > 0) {
            System.out.println("Checkout denied: Student has unpaid fines of $" + fine);
            return false;
        }

        if (!catalogService.isAvailable(isbn)) {
            System.out.println("Checkout denied: Book " + isbn + " is currently unavailable.");
            return false;
        }

        catalogService.setAvailability(isbn, false);
        loanRecorder.recordLoan(studentId, isbn);
        System.out.println("Success! Book issued.");
        return true;
    }

    public void returnBook(String studentId, String isbn) {
        System.out.println("--- Returning Book: " + isbn + " from " + studentId + " ---");
        catalogService.setAvailability(isbn, true);
        loanRecorder.removeLoan(studentId, isbn);
        System.out.println("Book is now available in catalog again.");
    }
}