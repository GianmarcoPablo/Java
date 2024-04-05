
public interface Canino {
    public abstract void aullar();

    public default void ladrar() {
        System.out.println("El canino ladra");
    }

}
