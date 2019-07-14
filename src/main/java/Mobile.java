public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String outputMessage(){
        return "Message : [your input message]";
    }

    public String outputBasicMobileInfo(){
        return String.format("name: [%s], color: [%s], brand: [%s]",name,color,brand);
    }
}
