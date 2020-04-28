package nested.properties;

public class Something {
    private Fred fred;

    public Something() {
        fred = new Fred();
    }

    public Fred getFred() {
        return fred;
    }

    public void setFred(Fred fred) {
        this.fred = fred;
    }
}
