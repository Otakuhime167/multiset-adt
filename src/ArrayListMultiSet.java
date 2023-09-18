// import java.util.List;

import java.awt.*;

public class ArrayListMultiSet {
    List _list;
    public ArrayListMultiSet() {
        this._list = emptyList();
    }

    boolean add(Object item){ //item should be any
        this._list.add(item);
        return true;
    }

    void remove(Object item){
        if (this._list.contains(item)){
            this._list.remove(item);
        }
    }

    boolean contains(Object item){
        return this._list.contains(item);
    }

    boolean is_empty(){
        return this._list.equals(emptyList);
    }
}
