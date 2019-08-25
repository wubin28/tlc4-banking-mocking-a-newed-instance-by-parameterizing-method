package kata.taminglegacycode.tlc4.banking;

public class BankingServiceImpl {

    public void exec(String id, JSONObject json, int length) {
        exec(id, json, length, new JsonListResult(MessageCode.OK, SysConstants.ECHO_RESULT_OK, json.getString(SysConstants.JSON_NODE_NO)));
    }

    public void exec(String id, JSONObject json, int length, JsonListResult result) {
        // ...
        // ...

        if (length < 3) {
            result.setStatus(MessageCode.TSC_1);
        }



    }

    @Test
    void aaaTest() {
        BankingServiceImpl spyService = spy(new BankingServiceImpl());

        doReturn(mockResult).when(spyService).buildResult();

    }

    @Test
    void bbbTest() {
        BankingServiceImpl fakeService = new BankingServiceImpl() {
            @Override
            public void buildResult() {

            }
        }
    }
}
