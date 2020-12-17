import java.util.Scanner;
//Izabella Paulski
public class SinglyLinkedListDriver {

    public static int getInteger(Scanner input) {
        // DO THIS
        //  Gets an integer from the scanner, tests for valid integer
        //  If not valid,  display "Please enter an integer: "
        //  Stay here until a valid integer is entered.
        try{
            return input.nextInt();
        }
        catch(Exception e){
            System.out.println("Please enter an integer: ");
            return getInteger(new Scanner(System.in));
        }
    }

    public static char getAction(Scanner input) {
        // DO THIS
        //  Read a line from the scanner ... get the first character
        //from the line to determine the action
        //  Make sure the line read is not equal to 0.
        //  Return the action character
        try{
            String s = input.next();
            return s.charAt(0);
        }
        catch(Exception e){
            System.out.println("Please enter a non-zero value: ");
            return getAction(new Scanner(System.in));
        }
    }

    public static void main (String[] args) {

        // DO NOT ADD ANY EXTRA VARIABLES
        SortedSinglyLinkedList<Integer> sll = new SortedSinglyLinkedList<Integer>();
        int value;
        char action;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter (a)dd, (d)elete, (f)ind, (p)rint, (c)lear list, (s)ize of list or (q)uit: ");
            action = getAction(input);

            switch (action) {
                // DO THIS -- handle the case for each action
                case 'a':
                System.out.println("Enter int to add to list: ");
                sll.add(getInteger(input));
                break;
                case 'd':
                System.out.println("Enter int to be deleted from list: ");
                sll.remove(getInteger(input));
                break;
                case 'f':
                System.out.println("Enter int to be searched in list: ");
                sll.found(getInteger(input));
                break;
                case 'p':
                System.out.println("The list is");
                sll.print();
                break;
                case 'c':
                System.out.println("The list will be erased.");
                sll.clearList();
                break;
                case 's':
                System.out.println("The number of int(s) in the list are: ");
                System.out.println(sll.getSize());
                break;
            }

        } while (action != 'q');

        input.close();

        System.out.println( "Done.\n");
    }
}