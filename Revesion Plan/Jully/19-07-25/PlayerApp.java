import java.util.*;

class Player {
    int id;
    String name;
    int run;

    public Player(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public String toString() {
        return id + " " + name + " " + run;
    }
}

class PlayerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Player> al = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Id");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Enter Name");
            String name = sc.nextLine();

            System.out.println("Enter Run");
            int run = sc.nextInt();

            Player p = new Player(id, name, run);
            al.add(p);
        }

        al.sort((p1, p2) -> Integer.compare(p2.getRun(), p1.getRun()));

        System.out.println("\nAll Players Sorted by Run (Descending):");
        for (Player p : al) {
            System.out.println(p);
        }

        if (al.size() >= 3) {
            System.out.println("\nSecond Highest Run Scorer:");
            System.out.println(al.get(1));

            System.out.println("\nThird Highest Run Scorer:");
            System.out.println(al.get(2));
        } else {
            System.out.println("Not enough players to determine second and third highest.");
        }
    }
}
