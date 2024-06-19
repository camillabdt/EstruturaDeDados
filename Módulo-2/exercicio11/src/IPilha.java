public interface IPilha<T> {
    boolean push(T info);
    T pop();
    T top();
    boolean isEmpty();
    int size();
}
