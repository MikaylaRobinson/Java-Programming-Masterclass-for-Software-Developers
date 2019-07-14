import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        // Code from testing the overall program and implementation of binary search
        //  theatre.getSeats();
/*        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat taken");
        }
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat taken");
        }*/

        // Making a copy of the original ArrayList
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);


        // Below tests that the copy and the original are still sharing data
        // If they do not, reserving A02 would work twice
        // First, we reserve A02 in the copy
        seatCopy.get(1).reserve();
        // Then, attempt to reserve A02 in the original, which returns already reserved
        // They refer to the same objects that were created
        // There are two "copies" of each seat, one in each ArrayList, but they reference the same object
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        // To demonstrate this further, we will sort one in reverse order and then print out the other
        // They are separate ArrayLists, so you can display each of them differently, but they still reference the same objects
        // Options for changing lists are reverse as well as shuffle
        // This will print the copy in reverse, but the original will remain the same
        Collections.reverse(seatCopy);
        System.out.println("Print of seatcopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        // There are also methods for returning the min and the max
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        // There is also a method to swap objects within a list
        // Using this swap method, we can sort the list (using method written below)
        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffled seatCopy");
        printList(seatCopy);
        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy after shuffle");
        printList(seatCopy);

        // Above we ar making shallow copies, that are just a duplicate reference to the same object
        // You can also make a deep copy which actually duplicates the objects themselves
        // When doing this, you must copy the list into a list that contains the right number of items to fit your list to be copied
        // You can do this using Collections.copy()

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
