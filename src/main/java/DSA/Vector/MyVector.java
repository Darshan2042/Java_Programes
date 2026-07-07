package DSA.Vector;

import java.util.Arrays;

public class MyVector {
	private int a[] = null;
	private int index = -1;

	public MyVector() {
		this(10);
	}

	public MyVector(int size) {
		a = new int[size];
	}

	public boolean isEmpty() {
		return index == -1;
	}

	private boolean isFull() {
		return index == a.length - 1;
	}

	public int size() {
		return index + 1;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (!isEmpty()) {
			for (int i = 0; i <= index; i++) {
				sb.append(a[i]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}

	public void add(int obj) {
		if (isFull()) {
			a = Arrays.copyOf(a, a.length * 2);
		}
		a[++index] = obj;
	}

	public boolean remove(int obj) {
		if (isEmpty()) {
			throw new EmptyVectorException();
		}

		for (int i = 0; i <= index; i++) {
			if (a[i] == obj) {
				for (int j = i; j < index; j++) {
					a[j] = a[j + 1];
				}
				index--;
				return true;
			}
		}
		return false;
	}

	public int removeAt(int index) {
		if (isEmpty()) {
			throw new EmptyVectorException();
		}
		if (index < 0 || index > this.index) {
			throw new IndexOutOFBoundException();
		}
		int removed = a[index];
		for (int i = index; i < this.index; i++) {
			a[i] = a[i + 1];
		}
		this.index--;
		return removed;
	}

	public void insert(int index, int obj) {
		if (index >= 0 && index <= this.index + 1) {
			if (isFull()) {
				a = Arrays.copyOf(a, a.length * 2);
			}
			for (int i = this.index; i >= index; i--) {
				a[i + 1] = a[i];
			}
			a[index] = obj;
			this.index++;
		} else {
			throw new IndexOutOFBoundException();
		}
	}

	public boolean contains(int obj) {
		for (int i = 0; i <= index; i++) {
			if (a[i] == obj) {
				return true;
			}
		}
		return false;
	}

	public int get(int index) {
		if (index < 0 || index > this.index) {
			throw new IndexOutOFBoundException();
		}
		return a[index];
	}

	public void set(int index, int obj) {
		if (index < 0 || index > this.index)
			throw new IndexOutOFBoundException();
		a[index] = obj;
	}

	public int indexOf(int obj) {
		for (int i = 0; i <= index; i++) {
			if (a[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(int obj) {
		for (int i = index; i >= 0; i--) {
			if (a[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		index = -1;
	}

	public int capacity() {
		return a.length;
	}

	public int firstElement() {
		if (isEmpty()) {
			throw new EmptyVectorException();
		}
		return a[0];
	}

	public int lastElement() {
		if (isEmpty()) {
			throw new EmptyVectorException();
		}
		return a[index];
	}

	public void addAll(MyVector v) {
		if (v.isEmpty()) {
			throw new EmptyVectorException();
		}
		for (int i = 0; i <= v.index; i++) {
			add(v.a[i]);
		}
	}

}
