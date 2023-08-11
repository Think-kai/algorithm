import bubble.BubbleSort;
import insertionSort.InsertionSort;
import selection.SelectionSort;

import java.util.Date;

/**
 * <p>Project: algorithm </p>
 * <p>Description: </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public class SortTest {
    public static void main(String[] args) {
        int[] numList = {6, 7, 8, 9, 10, 5, 4, 3, 2, 1};
        int length = numList.length;
        long startTime = new Date().getTime();

        //排序方式
//        int count = BubbleSort.bubbleSort(numList);
//        int count = SelectionSort.selectionSort(numList);
        int count = InsertionSort.insertionSort(numList);

        for (int i = 0; i < length; i++) {
            System.out.print(numList[i] + " ");
            System.out.println("");
        }
        System.out.println("for count: " + count);
        long endTime = new Date().getTime();
        System.out.println("exe time: " + (endTime - startTime));
    }
}