import java.io.IOException;

import org.json.JSONException;
import translator.GoogleTranslate;

public class Main {
  
  public static void main(String[] args) {
    try {
      String translatedText = null;
      String text = null;
      text = "Other dt parameters request additional information such as pronunciation, and so on.\nTODO Modify API so that the user may request this additional information.";
      translatedText = GoogleTranslate.translate("vi", text);
      System.out.println(translatedText);
      
    } catch (IOException | JSONException e) {
      e.printStackTrace();
    }
  }
  
}
