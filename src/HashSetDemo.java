import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo{
     
   public static void main(String args[]) {

      HashSet<String> supportedCurrencies = new HashSet<String>();              

      // adding object into HashSet, this will be translated to put() calls
      supportedCurrencies.add("USD");
      supportedCurrencies.add("EUR");
      supportedCurrencies.add("JPY");
      supportedCurrencies.add("GBP");
      supportedCurrencies.add("INR");
      supportedCurrencies.add("CAD");

      // retrieving object from HashSet
      Iterator<String> itr = supportedCurrencies.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());

      }
   }

}

