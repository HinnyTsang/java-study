import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateSearcher {
    public static void main (String [] args) {
        String [] arr1 = {"Python", "JAVA", "PHP", "C#", "C++"};
        String [] arr2 = {"SQLite", "Oracle", "C++", "DB2", "JAVA"};

        Set<String> myMap = new HashSet<String>(Arrays.asList(arr1));

        for (String items: arr2) {
            if (myMap.contains(items)) 
                System.out.println(items);
        }
    }
}
