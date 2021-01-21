package Sort.InsertSort;

/**
 *
 * 插入排序实现算法
 */
public class Insert {

    private int [] a;

    private int num;

    public Insert(int [] a){

        this.a = a;
    }

    public void insert(){
        num = 0;
        for (int i = 1; i < a.length; i++) {
            boolean flag  = false;
            for (int j = i-1; j >=0 ; j--) {
                if(a[i] < a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                    flag = true;
                    ++num;
                }
                if(flag = false){
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.print("\n");

        System.out.print("共发生交换 "+num+" 次");

    }


}
