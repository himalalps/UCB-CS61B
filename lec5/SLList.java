public class SLList {

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    /* the first item(if exists), is at sentinel.next */
    private IntNode sentinel;
    private int size;

    public SLList() {
        this.sentinel = new IntNode(63, null);
        this.size = 0;
    }

    public SLList(int x) {
        this.sentinel = new IntNode(63, null);
        this.sentinel.next = new IntNode(x, null);
        this.size = 1;
    }

    public void addFirst(int x) {
        this.sentinel.next = new IntNode(x, this.sentinel.next);
        this.size += 1;
    }

    public int getFirst() {
        return this.sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode p = this.sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        this.size += 1;
    }

    private static int size(IntNode p) {
        if (p == null) {
            return 0;
        } else if (p.next == null) {
            return 1;
        } else {
            return 1 + size(p.next);
        }
    }

    public int size() {
//        return size(this.sentinel.next);
        return this.size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        int x = L.getFirst();
        System.out.println(L.size());

        SLList L1 = new SLList();
        L1.addLast(20);
        System.out.println(L1.size());
    }
}
