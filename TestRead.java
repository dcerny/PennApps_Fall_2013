import java.util.List;

public class TestRead {
  public static void main(String args[]) {
    StaXParser read = new StaXParser();
    List<Part> readConfig = read.readConfig("musicXML_example.xml");
    for (Part part : readConfig) {
      System.out.println(part);
    }
  }
}