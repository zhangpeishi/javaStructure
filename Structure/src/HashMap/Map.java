package HashMap;

/**
 * 模拟java Map接口，put,get,size方法
 */
public interface Map<K,V> {

    V put(K k, V v);
    V get(K k);
    int size();

    interface Entry<K,V>{
        K getKey();
        V getValue();
    }


}
