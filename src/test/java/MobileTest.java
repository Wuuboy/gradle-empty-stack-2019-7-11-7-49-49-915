import org.junit.Test;
import static org.junit.Assert.*;

public class MobileTest {

    @Test
    public void should_return_mobile_message(){
        Mobile mobile = new Mobile("huawei","blue","huaweiMate20");
        String rightMessage = mobile.outputMessage();
        System.out.println(rightMessage);
        String rigthMobileInfo = mobile.outputBasicMobileInfo();
        System.out.println(rigthMobileInfo);
    }

    @Test
    public void should_return_android_mobile_message(){
        //given
        Mobile android = new Android("vivo","red","vivo7");
        //when
        String rightMessage = android.outputMessage();
        //then
        assertSame("<Android>Message : [your input message]",rightMessage);
    }

    @Test
    public void should_return_iphone_mobile_message(){
        //given
        Mobile iPhone = new IPhone("iPhone","white","iPhone8");
        //when
        String rightMessage = iPhone.outputMessage();
        //then
        assertSame("<iPhone>Message : [your input message]",rightMessage);
    }
}
