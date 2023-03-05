public class DLList {

    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode prev;

        public IntNode(int i) {
            this.item = i;
            this.next = this;
            this.prev = this;
        }

        public IntNode(int i, IntNode n, IntNode p) {
            this.item = i;
            this.next = n;
            this.prev = p;
        }
    }

    /* the first item(if exists), is at sentinel.next */
    private IntNode sentinel;
    private int size;

    public DLList() {
        this.sentinel = new IntNode(63);
        this.size = 0;
    }

    public DLList(int x) {
        this.sentinel = new IntNode(63);
        this.sentinel.next = new IntNode(x, this.sentinel, this.sentinel);
        this.sentinel.prev = this.sentinel.next;
        this.size = 1;
    }

    public void addFirst(int x) {
        this.sentinel.next = new IntNode(x, this.sentinel.next, this.sentinel);
        this.sentinel.next.next.prev = this.sentinel.next;
        this.size += 1;
    }

    public int getFirst() {
        return this.sentinel.next.item;
    }

    public void addLast(int x) {
        this.sentinel.prev = new IntNode(x, this.sentinel, this.sentinel.prev);
        this.sentinel.prev.prev.next = this.sentinel.prev;
        this.size += 1;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        DLList L = new DLList(10);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        int x = L.getFirst();
        System.out.println(L.size());

        DLList L1 = new DLList();
        L1.addLast(20);
        System.out.println(L1.size());
    }
}
