import java.util.TreeSet;

public class TreeSet_Eg1
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ranks =
                new TreeSet<>();

        // add()
        ranks.add(105);
        ranks.add(101);
        ranks.add(110);
        ranks.add(103);
        ranks.add(108);

        // duplicate not allowed
        ranks.add(103);

        System.out.println(
                "Student Ranks : "
                        + ranks);

        // first()
        System.out.println(
                "Top Rank : "
                        + ranks.first());

        // last()
        System.out.println(
                "Last Rank : "
                        + ranks.last());

        // contains()
        System.out.println(
                "Contains 108 : "
                        + ranks.contains(108));

        // higher()
        System.out.println(
                "Higher than 103 : "
                        + ranks.higher(103));

        // lower()
        System.out.println(
                "Lower than 105 : "
                        + ranks.lower(105));

        // ceiling()
        System.out.println(
                "Ceiling of 104 : "
                        + ranks.ceiling(104));

        // floor()
        System.out.println(
                "Floor of 104 : "
                        + ranks.floor(104));

        // headSet()
        System.out.println(
                "Before 108 : "
                        + ranks.headSet(108));

        // tailSet()
        System.out.println(
                "From 105 : "
                        + ranks.tailSet(105));

        // subSet()
        System.out.println(
                "Range 103 to 110 : "
                        + ranks.subSet(103, 110));

        // descendingSet()
        System.out.println(
                "Descending Order : "
                        + ranks.descendingSet());

        // remove()
        ranks.remove(110);

        System.out.println(
                "After Remove : "
                        + ranks);

        // pollFirst()
        System.out.println(
                "Removed First : "
                        + ranks.pollFirst());

        // pollLast()
        System.out.println(
                "Removed Last : "
                        + ranks.pollLast());

        System.out.println(
                "Final TreeSet : "
                        + ranks);
    }
}