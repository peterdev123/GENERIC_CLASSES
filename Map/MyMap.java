package Map;

import java.util.*;

public class MyMap<KEY, VALUE>{
    private ArrayList<KEY> keys;
    private ArrayList<VALUE> values;

    public MyMap() {
        this.keys =  new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void put(KEY key, VALUE value) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            values.set(pos, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public VALUE get(KEY key) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            return (VALUE) values.get(pos);
        }

        return null;
    }

    public VALUE remove(KEY key) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            VALUE res = (VALUE) values.remove(pos);
            keys.remove(pos);
            return res;
        }

        return null;
    }
}
