import java.util.Arrays;

public class stringg {
    public static void main(String[] args) {
        String str = "subash";
        String str2 = "subash";
        String s = new String("subash");
        String s2 = new String("subash");
        if(str.equals(s)){
            System.out.println("true");
        }else{
            System.out.println(false);
        }

        String stri = "abcdef ghijklmno";
        char x = stri.charAt(1);
        String[] arr = stri.split(" ");
        System.out.println(Arrays.toString(arr));


    }
}
