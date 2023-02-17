import java.util.LinkedList;
import java.util.Scanner;

public class ThuatToanTimKiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ");
        String str = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            LinkedList<Character> characters = new LinkedList<>();
            characters.add(str.charAt(i));
            for (int j = i+1; j <str.length(); j++) {
                if(str.charAt(j) > characters.getLast()){
                    characters.add(str.charAt(j));
                }
            }
           if(characters.size() > max.size()){
               max.clear();
               max.addAll(characters);
           }
           characters.clear();
        }
        System.out.println(max.toString());
    }
}
