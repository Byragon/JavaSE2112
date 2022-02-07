package String;

public class 字符串API_replaceAll {
    public static void main(String[] args) {
        String str=" 我草疫情又严重了，我去，又要去做核酸了";
        String s=str.replaceAll("我[操艹去草]","***");
        System.out.println(s);
    }
}
