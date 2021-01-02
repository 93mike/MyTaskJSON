package readJSON;

import clases.AllFilesFromJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonFile {
    public AllFilesFromJSON getDateFromJSONFile() {
        ObjectMapper mapper = new ObjectMapper();
        AllFilesFromJSON jSonJava = null;
        try {
            File json = new File("./Task.json");
            jSonJava  = mapper.readValue(json, AllFilesFromJSON.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return jSonJava;
    }
}


