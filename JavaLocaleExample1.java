import java.util.Locale;

public class JavaLocaleExample1
{  
   public static void main(String[] args)   
   {  
      // create a new locale  
      Locale locale1 = new Locale("EN", "INDIA");
  
      // print locale  
      System.out.println("Locale: " + locale1);  
  
      // print language  
      System.out.println("Language: " + locale1.getDisplayLanguage());  
     
      // print country   
      System.out.println("Country Name: "  
                                 + locale1.getDisplayCountry());  
        
      // get a hash code and print it  
      System.out.println("HashCode for this locale: " + locale1.hashCode());  
   }  
} 