import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseChallenges {
    public static void main(String[] args) {
        System.out.println(reverseStr("apple"));
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(input));
        reverseArr(input);
        System.out.println(Arrays.toString(input));
        List<String> list = Arrays.asList("a", "b", "c", "d");
        System.out.println(list);
        List<String> listRev = reverseList(list);
        System.out.println(listRev);
    }
    // Time complexity?
    // O(n) - linear
    public static String reverseStr(String str) {
        // create empty variable to store reversed version
        String reverse = "";
        // iterate over the input string starting from the back
        for (int i = str.length() - 1; i >= 0; i--) {
            // add each char to reverse variable using charAt
            reverse  += str.charAt(i);
        }
        return reverse;
    }
    // Time complexity?
    // O(n) - linear
    public static void reverseArr(int[] arrNum) {
        // pointer that will start from back
        int j = arrNum.length - 1;
        // loop that will iterate till half of the array
        // 'i' is pointer which start from the beginning
        for (int i = 0; i < arrNum.length / 2; i++) {
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
    }
    public static List<String> reverseList(List<String> list) {
        // create an empty List to store reversed version
        List<String> reversedList = new ArrayList<>();
        // iterate provided list from the back and add element to reversedList
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        // return reversed version of list
        return reversedList;
    }
}

