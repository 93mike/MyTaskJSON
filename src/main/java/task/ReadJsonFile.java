package task;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class ReadJsonFile {
    public JSONObject jsonObject;
    private String stringFromJSON;

    public  String getDateFromJSONFile() {
        JSONParser jsonParser = new JSONParser();
        try {
            Object obj=jsonParser.parse(new FileReader("C:\\Users\\misha\\IdeaProjects\\MyTaskJson\\src\\main\\Task.json"));
            jsonObject=((JSONObject)obj);
            stringFromJSON = (jsonObject.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return stringFromJSON;
    }
}


