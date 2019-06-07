package javajezpruebas;

import java.util.Map;

/**
 * Clase KeyValue {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 11/09/2018
 */
public class KeyValue <K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }

}
