public class TextFactory extends DocumentFactory {
    @Override
    public Text create(String filename) {
        return new Text(filename);
    }
}
