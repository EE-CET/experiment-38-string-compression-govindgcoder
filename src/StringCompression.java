import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args){
        // TODO: Read the string
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        // TODO: Iterate through the string to count consecutive characters
        char prev = S.charAt(0);
        char current = S.charAt(0);
        int count = 0;
        for(int i=0;i<S.length();i++){
            current = S.charAt(i);
            if(prev==current) count++;
            else {
                sb.append(prev+Integer.toString(count));
                count = 1;
                prev=current;
            }
        }
        sb.append(current+Integer.toString(count));
        String res = sb.toString();
        if(res.length()<=S.length()){
            System.out.print(res); return;
        }
        System.out.print(S);
        // TODO: Compare lengths of original vs compressed
        // TODO: Print the shorter one (or compressed if equal length, depending on strict interpretation. Usually original if compressed is not strictly smaller, but prompt says "if compressed is longer")
    }
}
