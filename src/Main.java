import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // LOOL!!! TYPE ERASURE
        ArrayList<String> strings = new ArrayList<>();
        strings.add("qqq");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        //arrayList = strings; // Ok
        strings = arrayList; // Unchecked assignment
        strings.add("www");
        arrayList.add(2);



//        List<Integer> intList = Arrays.asList(1, 3, 2, 6, 1, 2, 7, 8, 3);
//
//        Map<Boolean, List<Integer>> groups = intList.stream().collect(Collectors.partitioningBy(s -> s >= 6));
//        List<List<Integer>> subSets = new ArrayList<>(groups.values());
//
//        List<Integer> firstPartition = subSets.get(0);
//        List<Integer> lastPartition = subSets.get(1);


    }
}
