package task07;

public class Main {
    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker();
        PageFormatter pageFormatter = new PageFormatter();
        PdfConverter pdfConverter = new PdfConverter();
        PrinterSpooler printerSpooler = new PrinterSpooler();

        DocumentFacade documentFacade = new DocumentFacade(spellChecker, pageFormatter, pdfConverter, printerSpooler);

        documentFacade.printCleanDocument("Lab report on Facade Design Pattern.");
        System.out.println();
        documentFacade.exportAsPdf("Final thesis draft for Java course.", "java_thesis");
    }
}