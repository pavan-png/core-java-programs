import java.util.HashMap;
import java.util.Map;

public class HashMap_Eg1
{
    public static void main(String[] args)
    {
        // Creating HashMap
        HashMap<Integer, String> interviews =
                new HashMap<>();

        // put()
        interviews.put(101, "Java Developer");
        interviews.put(102, "Python Developer");
        interviews.put(103, "DevOps Engineer");

        // putIfAbsent()
        interviews.putIfAbsent(
                104,
                "Data Engineer");

        // get()
        System.out.println(
                "Interview 102 : "
                        + interviews.get(102));

        // getOrDefault()
        System.out.println(
                "Interview 200 : "
                        + interviews.getOrDefault(
                        200,
                        "No Interview Found"));

        // containsKey()
        System.out.println(
                "Contains ID 103 : "
                        + interviews.containsKey(103));

        // containsValue()
        System.out.println(
                "Contains Java Developer : "
                        + interviews.containsValue(
                        "Java Developer"));

        // replace()
        interviews.replace(
                103,
                "Cloud Engineer");

        // remove()
        interviews.remove(101);

        // size()
        System.out.println(
                "Total Interviews : "
                        + interviews.size());

        // entrySet()
        System.out.println(
                "\nInterview Details");

        for(Map.Entry<Integer,String> entry
                : interviews.entrySet())
        {
            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());
        }

        // keySet()
        System.out.println(
                "\nInterview IDs : "
                        + interviews.keySet());

        // values()
        System.out.println(
                "\nInterview Roles : "
                        + interviews.values());

        // forEach()
        System.out.println(
                "\nUsing forEach()");

        interviews.forEach((id, role) ->
        {
            System.out.println(
                    id + " : " + role);
        });

        // isEmpty()
        System.out.println(
                "\nIs Empty : "
                        + interviews.isEmpty());

        // clear()
        interviews.clear();

        System.out.println(
                "After clear() : "
                        + interviews);
    }
}