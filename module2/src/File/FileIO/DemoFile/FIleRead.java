package File.FileIO.DemoFile;

import java.io.*;
import java.util.List;

public class FIleRead {
    // write file
    public void writeFile(String path, List<mark> markList){
        try(FileWriter f = new FileWriter(path)){
            for(mark mark : markList){
                f.write(mark.toStringFile());
                f.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ReadFile(String path){
        try {
//        // Đọc file theo đường dẫn
//        File f = new File(path);
//
//        // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
//        if(!f.exists()) {
//            throw new FileNotFoundException();
//        }
        // Đọc từng dòng của file và tiến hành cộng tổng lại

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = "";
            int sum = 0 ;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Sum = "+sum);

        } catch (FileNotFoundException e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("File không tồn tại hoặc nội dung có lỗi !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }



