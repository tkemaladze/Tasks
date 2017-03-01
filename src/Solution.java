import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 01.03.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        ArrayList<String> list = new ArrayList<String>();

        while(true) {
            String s = br.readLine();
            list.add(s);
            if (s.equals("exit")) {
                for (String x: list) {
                    bw.write(x);
                }
                break;
            }
            list.add("\n");
        }
        bw.close();
    }

}
