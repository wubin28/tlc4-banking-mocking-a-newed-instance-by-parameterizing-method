package kata.taminglegacycode.tlc4.banking;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BankingServiceImplTest {

    @Test
    public void status_of_result_should_be_set_to_TSC_1_if_length_is_less_than_3() {
        BankingServiceImpl bankingServiceImpl = spy(new BankingServiceImpl());
        JsonListResult jsonListResult = mock(JsonListResult.class);
        doReturn(jsonListResult).when(bankingServiceImpl).buildResult(any(JSONObject.class));

        // when
        bankingServiceImpl.exec("id", new JSONObject(), 1);

        // then
        verify(jsonListResult, times(1)).setStatus(MessageCode.TSC_1);
    }
}
