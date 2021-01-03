package readJSON;

import clases.BaseStructure;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonFile {
    public BaseStructure getDateFromJSONFile() {
        ObjectMapper mapper = new ObjectMapper();
        BaseStructure jSonJava = null;
        try {
            File json = new File("./Task.json");
            jSonJava  = mapper.readValue(json, BaseStructure.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSonJava;
    }
}


