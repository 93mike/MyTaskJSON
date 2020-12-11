package task;

public class ChildCompanies {
    private String companyName;
    private String companyAddress;
    private String companyState;
    private String companyPhone;

    public ChildCompanies(String companyName, String companyAddress, String companyState, String companyPhone) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyState = companyState;
        this.companyPhone = companyPhone;

    }

    @Override
    public String toString() {
        return "\""+companyName+"\"" + ":{"
                + "\"address\":\"" + companyAddress
                + "\",\"phone\":\"" + companyPhone
                + "\",\"state\":\"" + companyState
                + "\"}";
    }
}