import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{ 
  public static void main(String[] args) throws Exception 
  { 
    String abc = "([a-z])([A-Z]+)";
    String rename = "$1_$2";
    ArrayList<String> Lista = new ArrayList<String>();
    File file =  new File("calculator.java"); 
    Scanner scanner = new Scanner(file); 
  
    while (scanner.hasNextLine())
    {
        String sor = scanner.nextLine();
         Lista.add(sor);
    }
      for(int i = 0; i < Lista.size(); i++)
        System.out.println(Lista.get(i).replaceAll(abc, rename).toLowerCase());
  }
}