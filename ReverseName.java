import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a word");
        String initial=sc.nextLine();
        String ntr="";
        for(int i=0;i<initial.length();i++){
            ch=initial.charAt(i);
            ntr=ch+ntr;
        }
        System.out.println("the reversed word is "+ntr);
    }
}
