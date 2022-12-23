public class Text extends Document {

    public Text(String filename) {
        setName(filename);
    }

    @Override
    public void close() {
        System.out.println("Fermeture du document " + getName());
    }

    @Override
    public void save() {
        System.out.println("Sauvegarde du document " + getName());
    }

    @Override
    public void open() {
        System.out.println("Ouverture du document " + getName());
    }
}
