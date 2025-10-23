import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample10 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數：");

        // 建立 BufferedReader 物件，讀取鍵盤輸入
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        // 讀取輸入的整數（文字），存到字串 str1
        String str1 = br1.readLine();

        // 將字串轉成整數型別
        int num = Integer.parseInt(str1);

        System.out.println("剛輸入的整數是：" + num);

        System.out.println("請輸入一個字串：");

        // 再建立一個 BufferedReader 物件，讀取第二次輸入
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        // 讀取使用者輸入的字串
        String str2 = br2.readLine();

        System.out.println("剛剛輸入的字串是：" + str2);
    }
}
