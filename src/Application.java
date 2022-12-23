public class Application {
    public static void main(String[] args) {

        // Create a PDF
        PdfFactory pdfFactory = new PdfFactory();
        Pdf pdf = pdfFactory.create("cours.pdf");
        pdf.open();

        // Create a Text
        TextFactory textFactory = new TextFactory();
        Text text = textFactory.create("notes.txt");
        text.open();
    }
}