public class VengefulSLList<Item> extends SLList<Item> {
    private SLList<Item> deletedItems = new SLList<Item>();

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vsl = new VengefulSLList<Integer>();
        vsl.addLast(10);
        vsl.addLast(14);
        vsl.removeLast();
        vsl.removeLast();

        vsl.printLostItems();
    }
}
