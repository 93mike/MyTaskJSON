package clases;

import java.util.*;

public class Manufacturers {
    private String siteAddress;
    private String siteRegionState;
    private String reportSource;
    private String officePhoneNumber;
    private String siteName;
    private List<ChildCompanies> childCompanies;

    public String getSiteAddress() {
        return siteAddress;
    }

    public String getSiteRegionState() {
        return siteRegionState;
    }

    public String getReportSource() {
        return reportSource;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public String getSiteName() {
        return siteName;
    }

    public List<ChildCompanies> getChildCompanies() {
        return childCompanies;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public void setSiteRegionState(String siteRegionState) {
        this.siteRegionState = siteRegionState;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setChildCompanies(List<ChildCompanies> childCompanies) {
        this.childCompanies = childCompanies;
    }

    public boolean isChildCompanyInBaseStructure(ChildCompanies child){
        return childCompanies.contains(child);
    }
}
