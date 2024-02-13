import org.example.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThan1Second(){
        NetworkUtils.getConnection();
    }
}
