public class MyHashTable<K, V> {
    private class HashNode<K,V>{
        private K key;
        private V value;
        private HashNode<K,V> next;
        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }
    private HashNode<K,V>[] chainArray;
    private int M = 11;
    private int size;
    public MyHashTable(){}
    public MyHashTable(int M){
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }
    private int hashCode(K key){
        String keyS = key.toString();
        int hash = 1;
        for(int i = 0; i < keyS.length(); i++) {
            hash = 31 * hash + keyS.charAt(i);
        }
        return hash;
    }
    public int getIndex(K key){
        int hash = key.hashCode();
        int index = hash % M;
        return index;
    }
    public void put(K key, V value){
        int hash = key.hashCode();
        HashNode<K,V> node1 = chainArray[hash];
        HashNode<K,V> node2 = new HashNode<>(key, value);
        while(node1 != null){
            if(node1.key == key){
                node1.value = value;
                return;
            }
            node1 = node1.next;
        }
        node2.next = chainArray[hash];
        chainArray[hash] = node2;
        size++;

    }
    public V get(K key){
        int index = getIndex(key);
        return null;
    }
    public V remove(K key){}
    public boolean contains(V value){

    }
    public K getKey(V value){}

}
