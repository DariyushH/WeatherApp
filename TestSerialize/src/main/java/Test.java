import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> u = new ArrayList<>();

        for (int i = 0; i < 99; i++) {
            u.add(i);
        }

        for (int i = 0; i <u.size(); i++) {
            System.out.println(u.get(i));
        }
        for (Integer x:u) {
            System.out.println(x);
        }
    }
}
