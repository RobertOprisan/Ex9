import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Player> p = new PriorityQueue<Player>();
        p.add(new Player("Carlos", 8));
        p.add(new Player("Maria", 10));
        p.add(new Player("Victor", 9));
        System.out.println(p);

        while (!p.isEmpty()) {
            System.out.println(p.remove());
        }
    }
}