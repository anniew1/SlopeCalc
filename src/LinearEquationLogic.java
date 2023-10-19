import java.util.Scanner;
public class LinearEquationLogic {

    private String coord1;
    private String coord2;
    private Scanner scan;

    private LinearEquation linear;


    public LinearEquationLogic(){
        coord1 = "(0, 0)";
        coord2 = "(0, 0)";
        scan = new Scanner(System.in);
    }

    public void start(){
        getCoords();
        menu();
    }

    private void getCoords(){
        System.out.println("Welcome to the linear equation calculator");
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();

        int commaidx = coord1.indexOf(",");
        int x1 = Integer.parseInt(coord1.substring(1, commaidx));
        int y1 = Integer.parseInt(coord1.substring(commaidx + 2, coord1.length()-1));

        int commaidx2 = coord2.indexOf(",");
        int x2 = Integer.parseInt(coord2.substring(1, commaidx2));
        int y2 = Integer.parseInt(coord2.substring(commaidx2 + 2, coord2.length()-1));

        linear = new LinearEquation(x1, y1, x2, y2);

        }
    private void menu(){
        String option = "y";
        while (option.equals("y")){
            System.out.println("");
            System.out.println(linear.lineInfo());
            option = "n";
        }

    }

}
