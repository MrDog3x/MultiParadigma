import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{ 
  public static void main(String[] args) throws Exception 
  { 
    String abc = "([a-z])([A-Z]+)";
    String rename = "$1_$2";
    ArrayList<String> Lista = new ArrayList<String>();
    ArrayList<String> ListaNew = new ArrayList<String>();

    File file =  new File("calculator.java"); 
    Scanner scanner = new Scanner(file); 
  
    while (scanner.hasNextLine())
    {
        String sor = scanner.nextLine();
         Lista.add(sor);
    }
      for(int i = 0; i < Lista.size(); i++)
      {
        System.out.println(Lista.get(i).replaceAll(abc, rename).toLowerCase());
        ListaNew.add(Lista.get(i).replaceAll(abc, rename).toLowerCase());
      }

        FileOutputStream Writer = new FileOutputStream("calculator.java");
        OutputStreamWriter writeInFile = new OutputStreamWriter(Writer);
        for(int i = 0; i < ListaNew.size(); i++)
        writeInFile.write(ListaNew.get(i)+"\n");
        writeInFile.close();
  }
}