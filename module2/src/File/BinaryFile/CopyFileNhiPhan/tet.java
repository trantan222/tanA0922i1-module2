package File.BinaryFile.CopyFileNhiPhan;

public class tet {
    public static void main(String[] args) {
        copy copy = new copy();
        String path = "C:\\Users\\PC\\Desktop\\New Text Document.txt";
        String path2 = "C:\\Users\\PC\\Desktop\\New Text Document (2).txt";
        copy.copy(path,path2);
    }
}
