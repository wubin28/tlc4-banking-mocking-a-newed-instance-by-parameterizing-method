package kata.taminglegacycode.tlc4.banking;

public class BankingServiceImpl {

    public void exec(String id, JSONObject json, int length) {
        // ...
        JsonListResult result = buildResult(json);
        // ...

        if (length < 3) {
            result.setStatus(MessageCode.TSC_1);
        }
    }

    JsonListResult buildResult(JSONObject json) {
        return new JsonListResult(MessageCode.OK, SysConstants.ECHO_RESULT_OK, json.getString(SysConstants.JSON_NODE_NO));
    }
}
