import java.util.ArrayList;
import java.util.List;

public class MainBT {
    public static void main(String[] args) {
//        Input: hwfdawhwhcoomddfgwdc
//        Output: 6 (w, aw, w, oo, dd, w)

        // nếu 1 chữ bằng thì + và đến chữ tiếp theo nếu sai thì lấy chữ đó cộng một chữ đằng sau
        String input = "hwfdawhwhcoomddfgwdc";
        List<String> check = new ArrayList<>();
        check.add("aw");
        check.add("oo");
        check.add("dd");
        check.add("ow");
        check.add("aa");
        int l = input.length();
        int res = 0;
        for (int i = 0; i < l; i++) {
            if (input.substring(i,i+1).equals("w")) {
                res++;
                i++;
                System.out.println(input.charAt(i-1));
            }else{
                if(i+2>l){
                    break;
                }
                for(int j = 0; j < check.size(); j++){
                    if(input.substring(i,i+2).equals(check.get(j))){
                        res++;
                        i+=2;
                        System.out.println(check.get(j));
                    }
                }
            }
        }
        System.out.println("Tổng số :"+ res);
    }
}
