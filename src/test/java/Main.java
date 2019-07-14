public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("huawei","blue","huaweiMate20");
        String rightMessage = mobile.outputMessage();
        System.out.println(rightMessage);
        String rightMobileInfo = mobile.outputBasicMobileInfo();
        System.out.println(rightMobileInfo);

        Mobile android = new Android("vivo","red","vivo7");
        String rightandroidMessage = android.outputMessage();
        System.out.println(rightandroidMessage);
        String rightAndroidMobileInfo = android.outputBasicMobileInfo();
        System.out.println(rightAndroidMobileInfo);

        Mobile iPhone = new IPhone("iPhone","white","iPhone8");
        String rightiPhoneMessage = iPhone.outputMessage();
        System.out.println(rightiPhoneMessage);
        String rightiPhoneMobileInfo = iPhone.outputBasicMobileInfo();
        System.out.println(rightiPhoneMobileInfo);


    }
}
