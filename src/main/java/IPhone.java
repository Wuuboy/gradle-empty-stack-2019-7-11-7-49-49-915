public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String outputMessage() {
        return "<iPhone>Message : [your input message]";
    }
}
