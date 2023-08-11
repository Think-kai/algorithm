package insertionSort;

/**
 * <p>Project: algorithm </p>
 * <p>Description: 插入排序
 *      每次多选一个进行组内排序，看起来像是插入；组内从后向前进行冒泡
 * </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public class InsertionSort {
    public static int insertionSort(int[] numList) {
        int length = numList.length;
        int count = 0;

        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (numList[j] > numList[j + 1]) {
                    int temp = numList[j];
                    numList[j] = numList[j + 1];
                    numList[j + 1] = temp;
                    count++;
                } else {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (Exception e) {

                }
            }
        }
        return count;
    }
}