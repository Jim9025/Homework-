public class Sample13 {
    public static void main(String[] args) {
        double dnum = 160.5;  // 宣告 double 型態變數 dnum 並給初值 160.5

        System.out.println("身高是" + dnum + "公分");

        // 將 double 型態轉換成 int 型態
        int inum = (int) dnum;

        System.out.println("指定給int型態的變數");
        System.out.println("身高是" + inum + "公分");
    }
}
