import org.junit.Assert;
import org.junit.Test;

import task.Steps;

public class JSONTest {
    @Test
    public void checkAmazon(){
        Steps steps =  new Steps();
        Assert.assertTrue(steps.JSONDATAToString().contains(steps.getAmazonToString()));
    }

    @Test
    public void checkAliExpress(){
        Steps steps =  new Steps();
        Assert.assertFalse(steps.JSONDATAToString().contains(steps.getAliExpressToString()));
    }
}
