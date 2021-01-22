package Sort.ChooseSort;

/**
 * @author zhangpeishi
 *
 * 选择排序实现算法
 *
 */
public class Choose {

    private int [] a;
    private int num;

    public Choose(int [] a){

        this.a = a;
    }
    public void choose(){

        for (int i = 0; i < a.length; i++) {
            int index = i;
            int min = a[i];
            for (int j = i; j < a.length; j++) {

                if(min > a[j]){
                    min = a[j];
                    index = j;
                }
            }

            int temp = a[i];
            a[i] = min;
            a[index] = temp;
            ++num;

        }
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }

        System.out.print("\n");

        System.out.print("共发生交换 "+num+" 次");

    }

}


