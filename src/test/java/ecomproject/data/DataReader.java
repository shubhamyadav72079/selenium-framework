package ecomproject.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class DataReader {
    public List<HashMap<String, String>> getJsonDataToMap() throws IOException {
        //read json to string
        String jasoncontent=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\ecomproject\\data\\Purchaserder.json")
        , StandardCharsets.UTF_8);
        //convert sstring to hasm map
        ObjectMapper mapper=new ObjectMapper();
        List<HashMap<String,String>> data=mapper.readValue(jasoncontent, new TypeReference<List<HashMap<String,String>>>() {
        });
        return data;

    }
}
