package HashMap;

public class HashMap<K,V> implements Map<K,V>{

    Entry<K,V> table[] = null;
    int size = 0;   //数组的元素个数

    public HashMap(Entry<K, V>[] table) {
        this.table = table;
    }

    public HashMap() {
        this.table = new Entry[16];
    }
    /**
     * 通过key hash算法算出哈希值
     * index下标 找到对象
     * 判断当前对象是否为空，如果是空，直接存储
     * 不为空则冲突，next链表
     * 返回当前节点
     * @param k
     * @param v
     * @return V
     */
    @Override
    public V put(K k, V v) {
        int index = hash(k);
        Entry<K,V> entry  = table[index];
        if(null == entry){
            table[index] = new Entry<>(k,v,index,null);
            size++;
        }else{
            table[index] = new Entry<>(k,v,index,entry);
        }

        return null;
    }

    /**
     * 计算数组中的下标
     * @param k key
     * @return int
     */
    private int hash(K k){

        int index = k.hashCode()%16;
        return index >= 0? index:-index;
    }

    /**
     * 通过hash值计算出数组下标
     * @param k
     * @return
     */
    @Override
    public V get(K k) {
        int index= hash(k);
        if(this.size == 0){
            return null;
        }
        Entry<K,V> entry = findValue(table[index],k);
        return entry.getValue();
    }

    /**
     * 根据指针和key查找
     * @param entry
     * @param k
     * @return
     */
    public Entry<K,V> findValue(Entry<K,V> entry, K k){
        if(entry == null){
            return null;
        }
        if(entry.getKey() == k || entry.getKey().equals(k)){
            return entry;
        }else {
            return findValue(entry.next,k);
        }

    }
    /**
     * 得到数组中的元素个数
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 节点数据结构(包括key,value,hash值，和指针）
     * @param <K>
     * @param <V>
     */
    class Entry<K,V> implements Map.Entry<K,V>{
        K k;
        V v;
        int hash;
        Entry<K,V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }


}
