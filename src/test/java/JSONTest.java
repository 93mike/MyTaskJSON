import clases.ChildCompanies;
import org.testng.Assert;
import org.testng.annotations.Test;
import readJSON.ReadJsonFile;

public class JSONTest {
    ReadJsonFile jSon = new ReadJsonFile();
    @Test
    public void checkChildCompanyAmazon() {
        ChildCompanies amazon = new ChildCompanies();
        amazon.setAddress("Amazon Address");
        amazon.setState("LA");
        amazon.setPhone("123456");
        Assert.assertTrue(jSon.getDateFromJSONFile().getManufacturers().isChildCompanyInBaseStructure(amazon));
    }

    @Test
    public void checkChildCompanyAliExpress() {
        ChildCompanies aliExpress = new ChildCompanies();
        aliExpress.setAddress("AliExpress Address");
        aliExpress.setState("China");
        aliExpress.setPhone("123123123");
        Assert.assertFalse(jSon.getDateFromJSONFile().getManufacturers().isChildCompanyInBaseStructure(aliExpress));
    }
}
