public class SLList<LochNess> implements ListCS61B<LochNess> {

    private class StuffNode {
        public LochNess item;
        public StuffNode next;
        public StuffNode prev;

        public StuffNode(LochNess i, StuffNode n, StuffNode p) {
            this.item = i;
            this.next = n;
            this.prev = p;
        }
    }

    /* the first item(if exists), is at sentinel.next */
    private StuffNode sentinel;
    private int size;

    public SLList() {
        this.sentinel = new StuffNode(null, null, null);
        this.sentinel.next = this.sentinel;
        this.sentinel.prev = this.sentinel;
        this.size = 0;
    }

    public void addFirst(LochNess x) {
        this.sentinel.next = new StuffNode(x, this.sentinel.next, this.sentinel);
        this.sentinel.next.next.prev = this.sentinel.next;
        this.size += 1;
    }

    @Override
    public LochNess getFirst() {
        return this.sentinel.next.item;
    }

    public void addLast(LochNess x) {
        this.sentinel.prev = new StuffNode(x, this.sentinel, this.sentinel.prev);
        this.sentinel.prev.prev.next = this.sentinel.prev;
        this.size += 1;
    }

    @Override
    public LochNess get(int i) {
        StuffNode p = this.sentinel.next;
        int ind = 0;
        while (ind < i) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void print() {
        for (StuffNode p = this.sentinel.next; p != this.sentinel; p = p.next) {
            System.out.print(p.item + " ");
        }
        System.out.println();
    }

    public LochNess removeLast() {
        LochNess last = this.sentinel.prev.item;
        this.sentinel.prev = this.sentinel.prev.prev;
        this.sentinel.prev.next = this.sentinel;
        this.size = this.size == 0 ? 0 : this.size - 1;
        return last;
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<Integer>();
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();
        System.out.println(L.size());

        SLList<String> L1 = new SLList<String>();
        L1.addFirst("thugs");
    }
}

