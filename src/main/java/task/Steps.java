package task;

public class Steps {
    String stringJsonFile;
    CreateChild createChild = new CreateChild();

    public String JSONDATAToString(){
        return stringJsonFile= (new ReadJsonFile()).getDateFromJSONFile();
    }

    public String getAmazonToString(){
        return createChild.getAmazon().toString();
    }

    public String getAliExpressToString(){
        return createChild.getAliExpress().toString();
    }
}
