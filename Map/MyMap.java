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
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            int pos = keys.indexOf(key);
            values.set(pos, value);
        }
    }

    public VALUE get(KEY key) {
        if (keys.contains(key)) {
            int pos = keys.indexOf(key);
            return (VALUE) values.get(pos);
        }

        return null;
    }

    public VALUE remove(KEY key) {
        if (keys.contains(key)) {
            int pos = keys.indexOf(key);
            keys.remove(pos);
            return (VALUE) values.remove(pos);
        }

        return null;
    }
}
