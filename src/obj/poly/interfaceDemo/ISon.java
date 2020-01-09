package obj.poly.interfaceDemo;

public interface ISon extends IFather {
    void run();

    default void connection() {
        System.out.println("IFather 中 connection");
    }
}
