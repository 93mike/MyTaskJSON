import clases.ChildCompanies;
import org.junit.Assert;
import org.junit.Test;
import readJSON.ReadJsonFile;

public class JSONTest {
    ReadJsonFile jSon = new ReadJsonFile();
    @Test
    public void checkChildCompanAmazon() {

        ChildCompanies amazon = new ChildCompanies();
        amazon.setAddress("Amazon Address");
        amazon.setState("LA");
        amazon.setPhone("123456");
        Assert.assertTrue(amazon.isChildCompanyInJSON(jSon.getDateFromJSONFile().getManufacturers().getChildCompanies(), amazon));
    }

    @Test
    public void checkChildCompanAliExpress() {
        ChildCompanies aliExpress = new ChildCompanies();
        aliExpress.setAddress("AliExpress Address");
        aliExpress.setState("China");
        aliExpress.setPhone("123123123");
        Assert.assertFalse(aliExpress.isChildCompanyInJSON(jSon.getDateFromJSONFile().getManufacturers().getChildCompanies(), aliExpress));
    }
}
