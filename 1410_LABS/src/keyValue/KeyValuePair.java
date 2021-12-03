package keyValue;

import java.util.Objects;

/**
 * Represents a key value pair
 * @author LouLebohec
 *
 * @param <K> the key, extends Comparable
 * @param <V> the value
 */
public class KeyValuePair<K extends Comparable<K>,V> implements Comparable<KeyValuePair<K,V>> {
	public K key;
	public V value;
	
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValuePair<String, Integer> other = (KeyValuePair<String, Integer>) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}
	
	@Override
	public String toString() {
		return "{"+this.key+", "+this.value+"}";
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	@Override
	public int compareTo(KeyValuePair<K, V> o) {
		return this.key.compareTo(o.key);
	}
	
	
}
