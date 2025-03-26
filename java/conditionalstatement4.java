import java.util.*;

public class conditionalstatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //ELSE IF CONDITIONAL STATEMENT 
        if(a == b){
            System.out.println("Equal");
        }else if(a>b){
            System.out.println("A is greater ");
        }else {
            System.out.println("B is greater ");
        }
    }
    
}
