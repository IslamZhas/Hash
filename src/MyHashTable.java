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
    public void put(K key, V value){
        int keyB = hashCode(key);
        HashNode<K,V> newNode = chainArray[keyB];
        while(newNode != null){
            if((newNode.key != null && newNode.key == key) ||(key == null && newNode.key == null)){
                newNode.value = value;
                return;
            }
            newNode = newNode.next;
        }
    }

    public V get(K key){
        int keyB = hashCode(key);
        HashNode<K,V> newNode = chainArray[keyB];
        while (newNode != null) {
            if(newNode.key == key){
                return newNode.value;
            }
        }
        return null;
    }
    public V remove(K key){
        int keyB = hashCode(key);
        HashNode<K,V> newNode = chainArray[keyB];
        while (newNode != null) {
            if(newNode.key == key){
                newNode.value = newNode.next.value;
                return newNode.value;
            }
        }
        return null;
    }
    public boolean contains(V value){return false;}
    public K getKey(V value){return null;}
}