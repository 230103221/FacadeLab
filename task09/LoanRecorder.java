package task09;

import java.util.ArrayList;
import java.util.List;

public class LoanRecorder {
    private List<String> loans = new ArrayList<>();

    public void recordLoan(String studentId, String isbn) {
        loans.add(studentId + ":" + isbn);
        System.out.println("LoanRecorder: Recorded checkout -> Student " + studentId + " took book " + isbn);
    }

    public void removeLoan(String studentId, String isbn) {
        loans.remove(studentId + ":" + isbn);
        System.out.println("LoanRecorder: Closed loan -> Student " + studentId + " returned book " + isbn);
    }
}