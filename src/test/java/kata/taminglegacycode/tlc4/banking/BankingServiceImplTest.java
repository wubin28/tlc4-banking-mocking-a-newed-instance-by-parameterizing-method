package kata.taminglegacycode.tlc4.banking;

import org.junit.Test;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class BankingServiceImplTest {
    @Test
    public void status_of_result_should_be_set_to_TSC_1_if_length_is_less_than_3() {
        BankingServiceImpl bankingServiceImpl = new BankingServiceImpl();
        JsonListResult mockResult = mock(JsonListResult.class);

        bankingServiceImpl.exec("id", new JSONObject(), 2, mockResult);

        then(mockResult).should(times(1)).setStatus(MessageCode.TSC_1);
    }
}
