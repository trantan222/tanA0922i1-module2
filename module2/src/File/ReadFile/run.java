package File.ReadFile;

import File.CopyFileText.ReadFile;

public class run {
    public static void main(String[] args) {
      ReadFilee readFilee = new ReadFilee();
      String path = ".\\src\\File\\ReadFile\\list.csv";
       readFilee.Read(path).forEach(System.out::println);
    }
}
