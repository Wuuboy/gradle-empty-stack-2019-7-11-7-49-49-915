import org.junit.Test;
import static org.junit.Assert.*;

public class MobileTest {

    @Test
    public void should_return_mobile_message(){
        //given
        Mobile mobile = new Mobile();
        //when
        String rightMessage = mobile.outputMessage();
        //then
        assertSame("Message : [your input message]",rightMessage);
    }

    @Test
    public void should_return_android_mobile_message(){
        //given
        Mobile android = new Android();
        //when
        String rightMessage = android.outputMessage();
        //then
        assertSame("<Android>Message : [your input message]",rightMessage);
    }

    @Test
    public void should_return_iphone_mobile_message(){
        //given
        Mobile iPhone = new IPhone();
        //when
        String rightMessage = iPhone.outputMessage();
        //then
        assertSame("<iPhone>Message : [your input message]",rightMessage);
    }
}
