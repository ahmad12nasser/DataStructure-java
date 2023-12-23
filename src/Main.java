import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CDStack cdStack = new CDStack();
        CD cd1 = new CD(1, "Album1", 2020, "Artist1", 0);
        cd1.Burn(new Song("Song1", 100));
        cd1.Burn(new Song("Song2", 200));
        cd1.Burn(new Song("Song3", 300));
        CD cd2 = new CD(2, "Album2", 2021, "Artist2", 0);
        cd2.Burn(new Song("Song4", 150));
        cd2.Burn(new Song("Song5", 250));
        CD cd3 = new CD(3, "Album3", 2022, "Artist1", 0);
        cd3.Burn(new Song("Song6", 200));
        cd3.Burn(new Song("Song7", 250));
        cdStack.push(cd1);
        cdStack.push(cd2);
        cdStack.push(cd3);
        System.out.print("Enter artist name to search: ");
        String n = scanner.nextLine();
        CD count = cdStack.searchByArtist(n);
        if (count != null) {
            System.out.println("Found CDs for artist '" + n + "':");
            cdStack.PrintAll();
        } else {
            System.out.println("No CDs found for artist '" + n + "'.");
        }
        cdStack.FullStackSize();

        cdStack.PrintAll();
    }
}
