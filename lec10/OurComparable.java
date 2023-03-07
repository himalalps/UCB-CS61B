public interface OurComparable {
    /**
     * @return neg if this < o;
     * 0 if this equals o;
     * pos if this > o.
     */
    public int compareTo(Object o);
}
