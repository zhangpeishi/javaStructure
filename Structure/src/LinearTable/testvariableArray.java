package LinearTable;

/**
 *
 * @author zhangpeishi
 *
 * 测试变长数组
 */
public class testvariableArray {

    public static void main(String[] args) {

        int [] testarr = {1,4,2,6,7,3};
        System.out.print("初始化原始数组为: ");
        for (int i = 0; i < testarr.length; i++) {
            System.out.print(testarr[i] + " ");
        }
        System.out.println("\n");
        variableArray varr = new variableArray(testarr);


        varr.add(8);
        System.out.print("加入元素8后的数组变成：");
        varr.traverse();
        System.out.println("\n");

        varr.del(1);
        System.out.print("删除index=1的元素后，数组变成：");
        varr.traverse();
        System.out.println("\n");

        System.out.print("index是1的元素是");
        System.out.println(varr.get(1));
        System.out.println("\n");

        varr.insert(3,0);
        System.out.print("在index=3的位置插入元素0,数组变为： ");
        varr.traverse();
        System.out.println("\n");

        varr.set(2,10);
        System.out.print("把index=2的元素更新为10，数组变成：");
        varr.traverse();
        System.out.println("\n");

        System.out.print("此时该动态数组的容量为： ");
        System.out.println(varr.size());

    }

}
