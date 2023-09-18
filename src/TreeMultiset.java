// Interface
interface Multiset {
}

// Pig "implements" the Animal interface
class TreeMultiset implements Multiset {

    Tree tree;

    public void init() {
        this.tree = Tree(None);
    }

    public boolean add(Object item) {
        this.tree.insert(item);
        return true;
    }

    public void remove(Object item) {
        this.tree.delete_item(item);
    }

    public boolean contains(Object item) {
        return this.tree.contains(item);
    }

    public boolean is_empty() {
        return this.tree.isEmpty();
    }

    public boolean count(Object item) {
        return this.tree.count(item);
    }

    public boolean size(Object item) {
        return length(this.tree);
    }
}