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

    public boolean search2(List<Integer> sortedList, int target) {
        var middle = sortedList.size() / 2;

        if(sortedList.size() > 0) {
            if(sortedList.get(middle) == target) {
                return true;
            } else {
                if(sortedList.get(middle) > target) {
                    return search2(sortedList.subList(0, middle), target);
                } else {
                    return search2(sortedList.subList(middle, sortedList.size()), target);
                }
            }
        } else {
            return false;
        }
    }
}
