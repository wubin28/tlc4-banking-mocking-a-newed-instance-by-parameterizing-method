package kata.taminglegacycode.tlc4.banking;

import org.junit.Test;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class BankingServiceImplTest {
    @Test
    public void status_of_result_should_be_set_to_TSC_1_if_length_is_less_than_3() {
        // given
        JsonListResult mockResult = mock(JsonListResult.class);
        BankingServiceImpl bankingServiceImpl = new BankingServiceImpl();

        // when
        bankingServiceImpl.exec("id", new JSONObject(), 1, mockResult);

        // then
        then(mockResult).should(times(1)).setStatus(MessageCode.TSC_1);
    }
}
