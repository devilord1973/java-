import java.util.*;

public class conditionalstatement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // this is  a if and else condition but it is much similar to else if conditional statement 
        if(a == b){
            System.out.println("equal");
        }else{
            if(a>b){
                System.out.println("a is greater than b ");
            }else{
                System.out.println("a is smaller than b");
            }
        }
    }
    
}
