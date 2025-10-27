package tp1.punto18;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class EvenNumberSet implements Set<Integer>{
	private Set<Integer> aux;
	
	public EvenNumberSet() {
		this.aux=new HashSet<Integer>();
	}
	@Override
	public int size() {
		return this.aux.size();
	}

	@Override
	public boolean isEmpty() {
		return this.aux.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.aux.equals(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.aux.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.aux.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.aux.toArray(a);
	}

	@Override
	public boolean add(Integer e) {
		if (e%2==0){
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return this.aux.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.aux.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		return this.aux.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.aux.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.removeAll(c);
	}

	@Override
	public void clear() {
		this.aux.clear();
		
	}

}
