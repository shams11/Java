import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToJson {

  public static void main(String[] args)
  {
    Map<String, Object> hashmap = new HashMap<String, Object>();

    hashmap.put("id", 11);
    hashmap.put("firstName", "Lokesh");
    hashmap.put("lastName", "Gupta");

    ObjectMapper mapper = new ObjectMapper();
    try
    {
      //Convert Map to JSON
      String json = mapper.writeValueAsString(hashmap);

      //Print JSON output
      System.out.println(json);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
