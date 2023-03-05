public class AList<Item> {
    private int size;
    private Item[] items;

    public AList() {
        this.items = (Item[]) new Object[100];
        this.size = 0;
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(this.items, 0, a, 0, this.size);
        this.items = a;
    }

    public void addLast(Item x) {
        if (this.size == this.items.length) {
            resize(this.size * 2);
        }
        this.items[this.size] = x;
        this.size += 1;
    }

    public Item getLast() {
        return this.items[this.size - 1];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return this.size;
    }

    public Item removeLast() {
        Item x = this.getLast();
        this.size -= 1;
        return x;
    }

    public static void main(String[] args) {

    }
}
