public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand, String message) {
        super(name, color, brand, message);
    }

    @Override
    public String outputMessage() {
        if(this.getMessage().length()>10){
            return "<iPhone> Message cannot be sent";
        }
        return "<iPhone>Message : [your input message]";
    }
}
