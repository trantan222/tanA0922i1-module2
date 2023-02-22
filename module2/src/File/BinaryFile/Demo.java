package File.BinaryFile;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception{
//         Đọc nội dung của file sử dụng FileInputStream
        try {
            InputStream inputStream = new FileInputStream("D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\read.csv");
            int i = -1;
            while((i = inputStream.read()) != -1){
                System.out.print( (char) i);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStream in = new FileInputStream("D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\read.csv");

        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
        // Ta dùng mảng 10 byte

        byte[] bytes = new byte[10];
        int i = -1;

        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
        // Khi không còn phần tử trong luồng i sẽ = -1
        while ((i = in.read(bytes)) != -1) {
            // Tạo String từ các byte đọc được
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();
        OutputStream outputStream = new FileOutputStream("D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\newtext.csv");
        Byte [] bytesS = new Byte[] {'T','R','A','N','T','A','N'};
        String tan = new String("TranTan");
        for (int index = 0; i <bytes.length ; i++) {
            outputStream.write(bytes[index]);
        }
//        for (int i = 0; i <tan.length() ; i++) {
//            outputStream.write(tan.getBytes());
//        }
        outputStream.close();




    };
}
