import java.util.*;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            list.add(i);
        }
        return getPermute(list);
    }

    private static List<List<Integer>> getPermute(List<Integer> list) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if (list.size() == 1) {
            resultList.add(list);
            return resultList;
        }
        for (Integer i : list) {
            List<Integer> copy = new ArrayList<Integer>(list);
            copy.remove(i);
            List<List<Integer>> fromRec = getPermute(copy);
            for (List<Integer> l : fromRec) {
                l.add(i);
                resultList.add(l);
            }
        }
        return resultList;
    }
}
