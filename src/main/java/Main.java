import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> someList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        var searchValue = 0;

        BinarySearch binarySearch = new BinarySearch();

        var result = binarySearch.search(someList, searchValue);
        var result2 = binarySearch.search2(someList, searchValue);

        System.out.println(result);
        System.out.println(result2);
    }
}
