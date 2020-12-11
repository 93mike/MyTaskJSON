package task;

public class CreateChild {
    ChildCompanies amazon ;
    ChildCompanies aliExpress;

    public CreateChild(){
        initCompany();
    }

    public ChildCompanies getAmazon() {
        return amazon;
    }

    public ChildCompanies getAliExpress() {
        return aliExpress;
    }

    public void initCompany(){
        amazon = new ChildCompanies("Amazon" ,"Amazon Address","LA","123456");
        aliExpress = new ChildCompanies("AliExpress" ,"AliExpress Address","China","123123123");
    }
}
