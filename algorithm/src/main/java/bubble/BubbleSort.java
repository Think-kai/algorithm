package bubble;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * <p>Project: algorithm </p>
 * <p>Description: 冒泡排序
 *      极端情况下。序列是完全相反的，效率与直接比较一样；序列本来就是有序的时候只需要遍历一遍就可以确认有序
 * </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public class BubbleSort {
    //5, 4, 3, 2, 1
    //4, 3, 2, 1, 5
    //3, 2, 1, 4, 5
    //直接比较： 692
    public static int bubbleSort(int[] numList) {
        int length = numList.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (numList[j] > numList[j + 1]) {
                    int temp = numList[j + 1];
                    numList[j + 1] = numList[j];
                    numList[j] = temp;
                    count++;
                    isSwap = true;
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
            if (!isSwap) {
                break;
            }
        }
        return count;
    }
}