import java.util.LinkedHashSet;

public class LinkedHashSet_Eg1
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> recentSearches =
                new LinkedHashSet<>();

        // add()
        recentSearches.add("iPhone");
        recentSearches.add("Laptop");
        recentSearches.add("Shoes");
        recentSearches.add("Watch");

        // duplicate not allowed
        recentSearches.add("Laptop");

        System.out.println("Recent Searches : "
                + recentSearches);

        // contains()
        System.out.println(
                "Contains Shoes : "
                        + recentSearches.contains("Shoes"));

        // remove()
        recentSearches.remove("Watch");

        System.out.println(
                "After Removing Watch : "
                        + recentSearches);

        // size()
        System.out.println(
                "Total Searches : "
                        + recentSearches.size());

        // isEmpty()
        System.out.println(
                "Is Empty : "
                        + recentSearches.isEmpty());

        // iteration
        System.out.println("Using for-each loop");

        for(String product : recentSearches)
        {
            System.out.println(product);
        }

        // clear()
        recentSearches.clear();

        System.out.println(
                "After clear() : "
                        + recentSearches);
    }
}