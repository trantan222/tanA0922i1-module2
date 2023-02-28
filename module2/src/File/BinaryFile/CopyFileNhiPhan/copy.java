package File.BinaryFile.CopyFileNhiPhan;

import java.io.*;

public class copy {
    public void copy(String path1,String path2){
        InputStream stream1 = null;
        OutputStream stream = null;
        try{
            stream1 = new FileInputStream(path1);
            stream = new FileOutputStream(path2);
            byte [] bytes = new byte[1024];
            int length;
            while ((length = stream1.read(bytes)) > 0){
                stream.write(bytes,0,length);
            }
            stream.flush();
            stream1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

