class LRUCache {
    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map < Integer, Node > map = new HashMap();
    int c;
class Node {
        Node prev, next;
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public LRUCache(int capacity) {
        c = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        else if (map.size() == c) {
            remove(tail.prev);
        }
        Node newNode =new Node(key, value);
        insert(newNode);
    }

    
    

    
}