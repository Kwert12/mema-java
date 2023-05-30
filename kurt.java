import java.util.Scanner;
public class kurt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, wep;
        float ans;
        System.out.println("------------What would you like to do??-----------");
        System.out.println("(1)Beat up a orphan");
        System.out.println("(2)basic 2 number calculator");
        System.out.println("(3)curse ivan");
        System.out.print("Write the number keme you want to do:");

        wep = scan.nextInt();
        switch(wep){
            case 1:
            System.out.println("-------------------------------------------");
            System.out.println("You want to beat up an orphant");
            System.out.println("---------whose the orphan you gonna beat up?----------");
            System.out.println("(1)ivan");
            System.out.println("(2)francis");
            System.out.println("(3)marquez");
            System.out.print("Type the number here:");
            a = scan.nextInt();
                if(a == 1){
                    System.out.println("------------------------------------------");
                    System.out.println("Pinitik ang itlog ni ivan ng sampung beses");
                    System.out.println("si ivan ay tumakbo habang umiiyak");
                    System.out.println("------------------------------------------");
                    System.out.println("The end");
                }
                    else if(a == 2) {
                    System.out.println("------------------------------------------");
                    System.out.println("Pinitik ang itlog ni francis ng sampung beses");
                    System.out.println("si francis ay tumakbo habang umiiyak");
                    System.out.println("------------------------------------------");
                    System.out.println("The end");
                    }
                    else if (a == 3) {
                        System.out.println("------------------------------------------");
                    System.out.println("Pinitik ang itlog ni marquez ng sampung beses");
                    System.out.println("si marquez ay tumakbo habang umiiyak");
                    System.out.println("------------------------------------------");
                    System.out.println("The end");
                    }
                    break;
                
            case 2:
            System.out.println("------------------------------------------");
            System.out.println("You have picked the basic calculator");
            System.out.println("------------------------------------------");
            System.out.println("(1)Addition");
            System.out.println("(2)Subtraction");
            System.out.println("(3)DIvision");
            System.out.println("(4)Multiplication");
            a = scan.nextInt();
                if(a == 1){
                    System.out.println("------------------------------------------");
                    System.out.print("FIrst number:");
                    b = scan.nextInt();
                    System.out.print("Second number:");
                    c = scan.nextInt();
                    ans = b + c;
                    System.out.println("------------------------------------------");
                    System.out.print("The ans is:"+ ans);
                }
                else if(a == 2){
                    System.out.println("------------------------------------------");
                    System.out.print("FIrst number:");
                    b = scan.nextInt();
                    System.out.print("Second number:");
                    c = scan.nextInt();
                    ans = b - c;
                    System.out.println("------------------------------------------");
                    System.out.print("The ans is:"+ ans);
                }if(a == 3){
                    System.out.println("------------------------------------------");
                    System.out.print("FIrst number:");
                    b = scan.nextInt();
                    System.out.print("Second number:");
                    c = scan.nextInt();
                    ans = b / c;
                    System.out.println("------------------------------------------");
                    System.out.print("The ans is:"+ ans);
                }
                if(a == 1){
                    System.out.println("------------------------------------------");
                    System.out.print("FIrst number:");
                    b = scan.nextInt();
                    System.out.print("Second number:");
                    c = scan.nextInt();
                    ans = b * c;
                    System.out.println("------------------------------------------");
                    System.out.print("The ans is:"+ ans);

                }
                break;
            case 3:
            System.out.println("------------------------------------------");
            System.out.println("Ivan is now cursed");
            System.out.println("Every time he poops its gonna be a size of a brick");
            break;
        }

    }

}