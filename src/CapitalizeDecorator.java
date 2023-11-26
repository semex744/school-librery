 public class CapitalizeDecorator extends  BaseDecorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String getCorrectName() {
        String name = nameable.getCorrectName();
        return name.toUpperCase();
    }
}
