import org.baade.eel.basic.message.protos.AccountProtos;
import org.junit.Test;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/3/23.
 */
public class ProtobufTest {

    @Test
    public void testProto() {
        AccountProtos.CSLogin.Builder loginMsg = AccountProtos.CSLogin.newBuilder();
        loginMsg.setType("type");
        loginMsg.setName("Haha");

        System.out.println("dddddddddd");
        System.out.println(loginMsg.build());
    }
}
