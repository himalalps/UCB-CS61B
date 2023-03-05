public interface List61B<Item> {
//    public void addLast(Item x);

    default public Item getLast() {
        return this.get(this.size() - 1);
    }
    public Item get(int i);
    public int size();
//    public Item removeLast();
//    public void insert(Item x, int pos);
//    public void addFirst(Item x);

    default public Item getFirst() {
        return this.get(0);
    }

    default public void print() {
        for (int i = 0; i < this.size(); i += 1) {
            System.out.print(this.get(i) + " ");
        }
        System.out.println();
    }
}
