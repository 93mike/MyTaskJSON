package clases;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildCompanies that = (ChildCompanies) o;
        return address.equals(that.address) &&
                state.equals(that.state) &&
                phone.equals(that.phone);
    }
}
