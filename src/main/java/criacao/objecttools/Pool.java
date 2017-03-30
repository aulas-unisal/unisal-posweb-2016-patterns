package criacao.objecttools;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
