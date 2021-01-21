package Sort.BubbleSort;

import java.util.concurrent.ForkJoinPool;
import java.util.function.DoubleToIntFunction;

/**
 *
 * @author zhangpeishi
 * 冒泡排序实现算法
 */
public class Bubble {

    private Integer[] arr;

    public Bubble(Integer[] arr){
        this.arr = arr;
    }

    public void bubble(){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] >arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
