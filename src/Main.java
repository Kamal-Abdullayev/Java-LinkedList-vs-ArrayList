import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("******** Add last index ********");
        addLastIndex(linkedList, "Linked List");
        addLastIndex(arrayList, "Array List");

        System.out.println("\n******** Add fist index ********");
        addFirstIndex(linkedList, "Linked List");
        addFirstIndex(arrayList, "Array List");

    }

    public static void addLastIndex(List<Integer> list, String dataType)
    {
        long start;
        long end;

        start = System.currentTimeMillis();

        // Add a million data
        for (int i = 0; i < 1000000; i++)
        {
            list.add(i);
        }

        end = System.currentTimeMillis();

        System.out.println(dataType + " added time " + (end - start) + " ms");
    }

    public static void addFirstIndex(List<Integer> list, String dataType)
    {
        long start;
        long end;

        start = System.currentTimeMillis();

        // Add 10,000 data
        for (int i = 0; i < 10000; i++)
        {
            list.add(0, i);
        }

        end = System.currentTimeMillis();

        System.out.println(dataType + " added time " + (end - start) + " ms");
    }
}
