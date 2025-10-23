public class Sample14 {
    public static void main(String[] args) {
        int d = 2;              // int 型態變數
        double pi = 3.14;       // double 型態變數

        System.out.println("直徑是" + d + "公分的圓");
        System.out.println("其圓周為" + (d * pi) + "公分");

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;               // int / int → 結果是 int → 5 / 4 = 1
        double div2 = (double) num1 / num2;      // 將 num1 轉為 double → 5.0 / 4 = 1.25

        System.out.println("5/4等於" + div1);
        System.out.println("5/4等於" + div2);
    }
}
