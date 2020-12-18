public  class Main
{
    public static void main(String args[])  
    {
        String abc = "([a-z])([A-Z]+)";
        String rename = "$1_$2";
        String[] Lista={"camelCase","snakeCase","multiParadigma"};
        for(int i = 0; i<Lista.length;i++)
        {
        System.out.println(Lista[i].replaceAll(abc, rename).toLowerCase());
        }
    
    }
}