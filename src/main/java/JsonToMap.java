import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonToMap {
  public static void main(String[] args)
  {
    String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";

    Map<String, Object> map;

    ObjectMapper mapper = new ObjectMapper();
    try
    {
      //Convert Map to JSON
      map = mapper.readValue(json, new TypeReference<Map<String, Object>>(){});

      //Print JSON output
      System.out.println(map);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
