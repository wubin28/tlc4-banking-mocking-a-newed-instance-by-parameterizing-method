package kata.taminglegacycode.tlc4.banking;

public class JsonListResult {
    private int status;

    public JsonListResult(int messageStatus, int resultStatus, String nodeNum) {

    }

    public void setStatus(int status) {
        throw new UnsupportedOperationException("JsonListResult.setStatus() not supported yet.");
    }

    public int getStatus() {
        return this.status;
    }
}
