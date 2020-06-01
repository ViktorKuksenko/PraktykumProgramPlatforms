package laba;
import java.lang.String;
import  java.util.Scanner;
public class Parser {
    private String in, withoutWhitespaces, action;
    private String [] arr, firstArr, secondArr;
    private int chis, znam, chis1, znam1;
    public Parser () {}

    public void calcStr(String in) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 4 numbers : " +
//                "\nSample: 5/8 + 6/5\n");
//         in = input.nextLine();
         withoutWhitespaces = in.trim();//забираємо пробіли
         String delimeter = "\\s";
         arr = withoutWhitespaces.split(delimeter);//розбиваю на 3 масиви '\\s' - пробіл розбиття по розмежувачу
         firstArr = arr[0].trim().split("/");

        String  newChis, newZnam, newChis1, newZnam1;

         action = arr[1];
         secondArr = arr[2].split("/");
         chis = Integer.parseInt(firstArr[0]);// String -> int
         znam = Integer.parseInt(firstArr[1]);
//        String action = withoutWhitespaces.substring(4,5);
         chis1 = Integer.parseInt(secondArr[0]);
         znam1 = Integer.parseInt(secondArr[1]);

        Fraction a1 = new Fraction(chis, znam);
        Fraction a2 = new Fraction(chis1, znam1);

        System.out.println(action);
        if(action.equals("*")) {
            System.out.println(a1.mult(a2));
        }else if(action.equals("/")) {
            System.out.println(a1.div(a2));
        } else if(action.equals("+")) {
            System.out.println(a1.add(a2));
        } else if (action.equals("-")) {
            System.out.println(a1.sub(a2));
        } else{
            throw new IllegalStateException("Unexpected action " + action);
        }
        for(int i = 0;i < firstArr.length; i++){
            System.out.println(firstArr[i]);
        }
    }

}
