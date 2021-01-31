package HashMap;

/**
 * @author zhangpeishi
 * 测试HashMap数据结构
 *
 */
public class test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("老婆","我爱你");
        map.put("宝贝儿","我想你");
        map.put("宝宝","我想死你了");

        System.out.println(map.get("宝宝"));
        System.out.println(map.size());

    }


}
