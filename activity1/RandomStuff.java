package activity1;
import java.util.*;
public class RandomStuff {
    private static int[] list = new int[5];
    private static boolean found = false;
    private static int opt = 0;
    private static int num;

    public static void main(String[] args) {
        for (int i = 1; i <= list.length; i++) {
            list[i-1] = i;
        }
            Scanner sc = new Scanner(System.in);
            while (opt != 7) {
                System.out.println(Arrays.toString(list) + "\n\nChoose an option: " +
                        "\n\n 1. Insert an element at the beginning." +
                        "\n 2. Insert an element at the end." +
                        "\n 3. Delete an element from the array." +
                        "\n 4. Search for an element and check its index." +
                        "\n 5. Update an element." +
                        "\n 6. Print Array List." +
                        "\n 7. Exit Program");
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Enter a number to insert: ");
                        list = Arrays.copyOf(list, list.length+1);
                        for (int i = list.length - 1; i > 0; i--) {
                            list[i] = list[i - 1];
                        }
                        list[0] = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Enter a new number: ");
                        list = Arrays.copyOf(list, list.length+1);
                        list[list.length-1] = sc.nextInt();
                        break;
                    case 3:
                        int[] newList = Arrays.copyOf(list, list.length-1);
                        System.out.println("Delete element number: ");
                        num = sc.nextInt();
                        checker();
                        if (!found) {
                            System.out.println("Number not found!");
                        } else {
                            for (int a = 0, b = 0; a < list.length; a++) {
                                if (list[a] != num) {
                                    newList[b] = list[a];
                                    b++;
                                }
                            }
                            list = newList;
                        }
                        found = false;
                        break;
                    case 4:
                        System.out.println("Select a number from the list: ");
                        num = sc.nextInt();
                        checker();
                        if (!found) {
                            System.out.println("Number not found!");
                        } else {
                            for (int a = 0; a < list.length; a++) {
                                if (list[a] == num) {
                                    System.out.println("Index: " + a);
                                }
                            }
                        }
                        found = false;
                        break;
                    case 5:
                        System.out.println("Select a number from the list: ");
                        num = sc.nextInt();
                        checker();
                        if (!found) {
                            System.out.println("Number not found!");
                        } else {
                            System.out.println("Enter new number: ");
                            int num2 = sc.nextInt();
                            for (int a = 0, b = 0; b < 1; a++) {
                                if (list[a] == num) {
                                    list[a] = num2;
                                    b++;
                                }
                            }
                        }
                        break;
                    case 6:
                        System.out.println(Arrays.toString(list));
                        break;
                    case 7:
                        System.out.println("Exiting Program");
                        break;
                    default:
                        System.out.println("Invalid Option! \n\n");
                }
            }
    }
        private static void checker() {
            for (int i : list) {
                if (i == num) {
                    found = true;
                    break;
                }
            }
        }
    }