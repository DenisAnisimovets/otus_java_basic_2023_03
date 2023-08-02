package exeption;

import java.io.Closeable;

public class Resource implements Closeable {
    @Override
    public void close() {
        System.out.println("Resource is closed");
    }

    public void useResource() {
        System.out.println("Resource is using");
    }
}