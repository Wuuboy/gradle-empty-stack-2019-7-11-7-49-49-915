public class Person {
    private String name;
    private Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public String call(){
        return mobile.outputMessage();
    }

}
