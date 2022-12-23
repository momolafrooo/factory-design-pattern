public abstract class Document {

    private String name;

    public abstract void close();
    public abstract void save();
    public abstract void open();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
