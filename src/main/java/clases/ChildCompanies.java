package clases;

import java.util.List;

public class ChildCompanies {
    private String address;
    private String state;
    private String phone;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    public boolean equals(ChildCompanies obj) {
        return (address.equals(obj.address)) && (state.equals(obj.state)) && phone.equals(obj.phone);
    }

    public boolean isChildCompanyInJSON(List<ChildCompanies> childCompany, ChildCompanies checkCompany){
        for (ChildCompanies childCompanies:childCompany){
            if (childCompanies.equals(checkCompany)){
                return true;
            }
        }
        return false;
    }
}
