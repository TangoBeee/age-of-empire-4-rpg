package Threads;

public class Food extends Thread implements Runnable {

    int food = 0;
    int wood = 0;
    int gold = 0;
    int stone = 0;

    boolean exit = false;

    @Override
    public void run() {
        while(!exit) {

            for (int i = 1; i == 1; i++) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                food += 100;
                wood += 100;
                gold += 100;
                stone += 50;
            }
        }
    }
    public void exitThread() {
        exit = true;
    }
    public String toString() {
        return String.format("food - %s, wood - %s, gold - %s, and stone - %s \n", food, wood, gold, stone);
    }


}
