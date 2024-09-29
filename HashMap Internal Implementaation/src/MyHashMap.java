public class MyHashMap<K, V> {

    private static final int DEFAULT_SIZE=1<<4; //16

    Entry[] hashArrayTable;

    MyHashMap(){
        hashArrayTable = new Entry[DEFAULT_SIZE];
    }

    class Entry<K, V>{
        K key;
        V value;
        Entry next;


        Entry(K k, V v){

            key = k;
            value = v;

        }

        public K getKey(){
            return key;
        }

        public void setKey(K k){
            this.key = k;
        }

        public V getValue(){
            return value;
        }

        public void setValue(V v){
            this.value = v;
        }
    }


    public V get(K key){

        int hashCode = key.hashCode() % hashArrayTable.length;

        Entry node = hashArrayTable[hashCode];

        while(node !=null){

            if(node.key.equals(key)){
                return (V) node.value;
            }
            node = node.next;
        }
        return null;

       
    }

    public void put(K key, V value) {

        int hashCode = key.hashCode() % hashArrayTable.length;

        Entry node = hashArrayTable[hashCode];

        if(node == null){
            node = new Entry<K,V>(key, value);
            hashArrayTable[hashCode] = node;
        } else {
            Entry prevNode = node;
            while(node != null){

                if(node.key.equals(key)){
                    node.value = value;
                    return;
                }

                prevNode = node;
                node = node.next;

            }

            Entry newNode = new Entry<K,V>(key, value);
            prevNode.next = newNode;

        }

    }






    public static void main(String[] args) throws Exception {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        myHashMap.put(1, "Banana");
        myHashMap.put(3, "Orange");

        System.out.println(myHashMap.get(3));

        System.out.println(myHashMap.get(9));
        System.out.println(myHashMap.get(1));
    }
}
