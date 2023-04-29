import java.util.*;

public class A1113337_0421_1 {
    public static void main(String[] argv){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你的電信郵件箱(example: XXX@XXX.XXX):");
        String Email = sc.nextLine();

        if(Email.matches("[a-z]+[@]{1}[a-z]+[.]{1}[a-z]+")){
            System.out.println("認證成功");
            
            System.out.print("請輸入你的生日(YYYY/MM/DD or MM/DD/YYYY):");
            String Birthday = sc.nextLine();
            
            if(Birthday.matches("[0-9]{4}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}|[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[0-9]{4}")){
                System.out.println("成功, 你的資訊是下面");
                System.out.println("Email:"+ Email);
                System.out.println("Birth:"+ Birthday);
            }else{
                System.out.println("你打錯了, 再打一次");
            }
        }else{
            System.out.println("認證失敗, 再打一次");
        }

        
   
    

    }
}