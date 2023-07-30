import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //String型のListを作成
        List<String> colors = new ArrayList<>();

        //要素追加
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("black");

        try {
            //要素の取得
            System.out.println(colors.size());
            System.out.println(colors.get(0));
            System.out.println(colors.get(1));
            System.out.println(colors.get(2));
            System.out.println(colors.get(3));
            System.out.println(colors.get(4));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("指定された範囲を超えています。");

        }
    }
}
