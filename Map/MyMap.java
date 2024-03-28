package Map;

import java.util.*;

public class MyMap<K, V>{
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public MyMap() {
        this.keys =  new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            values.set(pos, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            return (V) values.get(pos);
        }

        return null;
    }

    public V remove(K key) {
        int pos = keys.indexOf(key);
        if (pos != -1) {
            V res = (V) values.remove(pos);
            keys.remove(pos);
            return res;
        }

        return null;
    }
}
