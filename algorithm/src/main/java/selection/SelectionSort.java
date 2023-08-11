package selection;

import java.util.Date;

/**
 * <p>Project: algorithm </p>
 * <p>Description: </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public class SelectionSort {

    public static int selectionSort(int[] numList) {
        int length = numList.length;
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j < length; j++) {
                if (numList[i] > numList[j]) {
                    int temp = numList[j];
                    numList[j] = numList[i];
                    numList[i] = temp;
                    count++;
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        }

        return count;
    }
}