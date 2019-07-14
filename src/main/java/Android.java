public class Android extends Mobile{
    public Android(String name, String color, String brand, String message) {
        super(name, color, brand, message);
    }

    @Override
    public String outputMessage() {
        if(this.getMessage().length()>10){
            return "<Android> Message cannot be sent";
        }
        return "<Android>Message : [your input message]";
    }
}
