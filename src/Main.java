import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("без Stream API");
        Collections.sort(intList);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                System.out.println(intList.get(i));
            }
        }
        System.out.println("c Stream API");
        StreamMain streamMain = new StreamMain();
        streamMain.streamResult(intList).forEach(System.out::println);
    }
}

