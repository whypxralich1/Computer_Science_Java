package DiningPhilosophers;

import java.util.concurrent.Semaphore;

class PhilosopherThread extends Thread {
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public PhilosopherThread(Semaphore leftFork, Semaphore rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                contemplate();
                dine();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void contemplate() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is contemplating.");
        Thread.sleep((long) (Math.random() * 1000));
    }

    private void dine() throws InterruptedException {
        leftFork.acquire();
        rightFork.acquire();
        
        System.out.println(Thread.currentThread().getName() + " is dining.");
        Thread.sleep((long) (Math.random() * 1000));
        
        rightFork.release();
        leftFork.release();
        System.out.println(Thread.currentThread().getName() + " has finished dining.");
    }
}

public class DiningPhilosophersSimulation {
    public static void main(String[] args) {
        final int NUMBER_OF_PHILOSOPHERS = 5;
        Semaphore[] forks = new Semaphore[NUMBER_OF_PHILOSOPHERS];
        
        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            forks[i] = new Semaphore(1);
        }

        PhilosopherThread[] philosophers = new PhilosopherThread[NUMBER_OF_PHILOSOPHERS];
        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            philosophers[i] = new PhilosopherThread(forks[i], forks[(i + 1) % NUMBER_OF_PHILOSOPHERS]);
            philosophers[i].start();
        }
    }
}
