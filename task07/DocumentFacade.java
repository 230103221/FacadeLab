package task07;

public class DocumentFacade {
    private SpellChecker spellChecker;
    private PageFormatter pageFormatter;
    private PdfConverter pdfConverter;
    private PrinterSpooler printerSpooler;

    public DocumentFacade(SpellChecker spellChecker, PageFormatter pageFormatter, PdfConverter pdfConverter, PrinterSpooler printerSpooler) {
        this.spellChecker = spellChecker;
        this.pageFormatter = pageFormatter;
        this.pdfConverter = pdfConverter;
        this.printerSpooler = printerSpooler;
    }

    public void printCleanDocument(String text) {
        System.out.println("--- Preparing Document for Printing ---");
        spellChecker.checkSpelling(text);
        pageFormatter.applyA4Margins();
        printerSpooler.queuePrintJob(text);
        System.out.println("Document sent to printer successfully!");
    }

    public void exportAsPdf(String text, String fileName) {
        System.out.println("--- Exporting Document to PDF ---");
        spellChecker.checkSpelling(text);
        pageFormatter.applyA4Margins();
        pdfConverter.convertToPdfBytes(text, fileName);
        System.out.println("PDF export finished!");
    }
}