package File.BinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public void writeObject(String path, List<Product> list) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(list);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> readObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
           return (List<Product>) stream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
