/*
    We are given a List<List<Integer>>.
    e.g., list = [[-2, 3], [2, 3], [2, 1]]

    the list.get(i).get(0) is the centre of the circle and list.get(i).get(1) is the radius. So for example -> the radius of the first circle is 3, stretching from -5 to 1.
    Similarly, the other circle is from -1 to 5,
    and lastly from 1 to 3.
    new list becomes = [[-5, 1], [-1, 5], [1, 3]]
    Answer should be 6 because we have -5, -4, -3, -2, 4, 5
    We have to return the number of elements where there is no overlapping.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q4 {

    public static int q4SquareOA(List<List<Integer>> list){
        int result = 0;
        int[][] array = new int[list.size()][list.get(0).size()];

        for(int i = 0; i < array.length; i++){
            array[i][0] = list.get(i).get(0) - list.get(i).get(1);
            array[i][1] = list.get(i).get(0) + list.get(i).get(1);
        }

        // what if I find overlapping subLists and try to avoid taking them into consideration
        List<int[]> answer = new ArrayList<>();
        int[] currentInterval = array[0];
        answer.add(currentInterval);


        return result;
    }

    public static void main(String[] args){
        List<List<Integer>> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Enter your first number: ");
            int first = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int second = scanner.nextInt();
            List<Integer> subList = new ArrayList<>();
            subList.add(first);
            subList.add(second);
            list.add(new ArrayList<>(subList));
        }

        int result = q4SquareOA(list);
        System.out.println(result);
    }
}
