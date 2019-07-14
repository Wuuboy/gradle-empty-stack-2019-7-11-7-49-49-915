public class Android extends Mobile{
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String outputMessage() {
        return "<Android>Message : [your input message]";
    }
}
