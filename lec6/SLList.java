public class SLList<LochNess> {

    private class StuffNode {
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n) {
            this.item = i;
            this.next = n;
        }
    }

    /* the first item(if exists), is at sentinel.next */
    private StuffNode first;
    private int size;

    public SLList(LochNess x) {
        this.first = new StuffNode(x, null);
        this.size = 1;
    }

    public void addFirst(LochNess x) {
        this.first = new StuffNode(x, this.first);
        this.size += 1;
    }

    public LochNess getFirst() {
        return this.first.item;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<Integer>(10);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();
        System.out.println(L.size());

        SLList<String> L1 = new SLList<String>("bone");
        L1.addFirst("thugs");
    }
}
