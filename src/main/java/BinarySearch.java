import java.util.List;

public class BinarySearch {
    public int search(List<Integer> targetList, int searchedValue) {
        int result = -1;

        int middleOfList = (targetList.size() / 2);

        if(targetList.get(middleOfList) == searchedValue) {
            return searchedValue;
        } else if(targetList.size() <= 1) {
            return result;
        } else {
            if(searchedValue > targetList.get(middleOfList)) {
                return search(targetList.subList(middleOfList, targetList.size()), searchedValue);
            } else {
                return search(targetList.subList(0, middleOfList), searchedValue);
            }
        }
    }
}
