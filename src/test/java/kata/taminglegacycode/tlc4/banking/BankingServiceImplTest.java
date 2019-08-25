package kata.taminglegacycode.tlc4.banking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BankingServiceImplTest {

    @Spy
    @InjectMocks
    BankingServiceImpl bankingServiceImpl;

    @Mock
    JsonListResult jsonListResult;

    @Test
    public void status_of_result_should_be_set_to_TSC_1_if_length_is_less_than_3() {
        doReturn(jsonListResult).when(bankingServiceImpl).buildResult(any(JSONObject.class));

        // when
        bankingServiceImpl.exec("id", new JSONObject(), 1);

        // then
        verify(jsonListResult, times(1)).setStatus(MessageCode.TSC_1);
    }
}
