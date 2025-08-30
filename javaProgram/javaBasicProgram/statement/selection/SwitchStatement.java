package statement.selection;

public class SwitchStatement {
    int dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day of Week");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        SwitchStatement dow = new SwitchStatement();
        dow.dayOfWeek(1);
    }
}
