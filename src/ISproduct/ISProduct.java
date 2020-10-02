package ISproduct;

import java.util.List;

public interface ISProduct<T> {
    void add(T object);
    void update(Integer id, T newObject);
    void delete(Integer id);
    T findByID(Integer id);
    List<T> findByname(String name);
    List<T> finAll();
}
