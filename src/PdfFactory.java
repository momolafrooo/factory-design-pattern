public class PdfFactory extends DocumentFactory {

    @Override
    public Pdf create(String filename) {
        return new Pdf(filename);
    }
}
