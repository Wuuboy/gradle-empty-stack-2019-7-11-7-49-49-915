public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("huawei","blue","huaweiMate20");
        String rightMessage = mobile.outputMessage();
        System.out.println(rightMessage);
        String rightMobileInfo = mobile.outputBasicMobileInfo();
        System.out.println(rightMobileInfo);

        Mobile android = new Android("vivo","red","vivo7","我是个漂亮的手机，买下我！");
        String rightandroidMessage = android.outputMessage();
        System.out.println(rightandroidMessage);
        String rightAndroidMobileInfo = android.outputBasicMobileInfo();
        System.out.println(rightAndroidMobileInfo);

        Mobile iPhone = new IPhone("iPhone","white","iPhone8","我是个漂亮的手机，买下我！");
        String rightiPhoneMessage = iPhone.outputMessage();
        System.out.println(rightiPhoneMessage);
        String rightiPhoneMobileInfo = iPhone.outputBasicMobileInfo();
        System.out.println(rightiPhoneMobileInfo);

        Person person = new Person(android);
        System.out.println(person.call());

        IPhone iPhone1 = new IPhone("iPhone","yellow","iPhone7","I am good!");
//        IPhoneRobot iPhoneRobot = new IPhoneRobot(iPhone);  could not add (Moble)iPhone to it
        IPhoneRobot iPhoneRobot = new IPhoneRobot(iPhone1);



    }
}
