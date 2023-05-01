public class MyHashTable {
    private class HashNode<K,V>{
        private K key;
        private V value;
        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

    public MyHashTable(){}
    public MyHashTable(int M){}


}
