import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter an age: ");
        int age = input.nextInt();

        System.out.print("Enter a height in meters: ");
        float height = input.nextFloat();

        System.out.print("Enter a weight in pounds: ");
        float weight = input.nextFloat();

        System.out.print("Enter a jersey number: ");
        int jerseyno = input.nextInt();

        float pound = 0.45359237f;
        int meter = 100;

        float weightkg = pound * weight;
        int roundweight = (int) weightkg;

        float heightcm = height * meter;
        int roundheight = (int) heightcm;


        boolean eligibility = ((age>18 && age<35) && roundweight>=90);

        String ageCat=" Veteran";

        if (age>20) {
            ageCat="Rising Star";

        } else if (age>=20 && age<=30) {
            ageCat="Prime Player";
        }
        else {
            ageCat=" Veteran";
        }

        String Pposition="N/A";
        int positionNo = jerseyno;


        switch (positionNo) {
            case 1:
                Pposition="Goalkeeper";
                System.out.println("Goalkeeper");
                break;  // stop checking after a match
            case 2:
            case 5:
                Pposition = "Defender";
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                Pposition="Midfielder";
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                Pposition="Winger";
                System.out.println("Winger");
                break;
            case 9:
                Pposition="Striker";
                System.out.println("Striker");
                break;
            case 10:
                Pposition="Playmaker";
                System.out.println("Playmaker");
                break;
            default:
                Pposition="N/A";
                System.out.println("Player position not \n" +
                        "known”");
                break;
        }

        String lineUp="Bench";

        if (ageCat.equals("Prime Player")){
            if (roundweight<80){
                lineUp="Starting";
            }
        }

        System.out.println("\n"+
                "The player is playing "+
                lineUp);


        String status = (eligibility ? "Play":"Rest");

        System.out.println("\n"+
                "The player is " +
                status
        );


        System.out.print("\n"+
                "Player: "+ name +"\n" +
                "Age: "+ age + " " + ageCat+"\n" +
                "Height:"+ roundheight +"\n"  +
                "Weight: "+ roundweight +"\n"  +
                "Jersey: "+ jerseyno +"\n" +
                        "Position:"+ Pposition +"\n"  +
                        "Eligibility: "+ eligibility +"\n"  +
                        "Lineup Decision: "+ lineUp +"\n"  +
                        "Final Decision: "+ status +"\n"
                );

    }}