package Sync;

import java.util.concurrent.Phaser;

public class Restoran {
    private static final Phaser phaser = new Phaser(3);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Client(3000)).start();
        //Thread.sleep(100);
        new Thread(new Waiter(2000)).start();
        //Thread.sleep(100);
        new Thread(new Chef((int) Math.random() * 100 + 5000)).start();
        //Thread.sleep(100);

    }


    public static class Client implements Runnable {
        private int eatSpeed;

        public Client(int eatSpeed) {
            this.eatSpeed = eatSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.println("20:31 прибыл Обжора и сел за стол");
                phaser.arriveAndAwaitAdvance();
                System.out.println("Клиент ест");
                Thread.sleep(eatSpeed);
                phaser.arriveAndAwaitAdvance();
                System.out.println("Клиент оплатил счет и ушел");
                phaser.arriveAndDeregister();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Waiter implements Runnable {
        private int serviceSpeed;

        public Waiter(int serviceSpeed) {
            this.serviceSpeed = serviceSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.println("Официант взял заказ и передал на кухню");
                phaser.arriveAndAwaitAdvance();
                Thread.sleep(serviceSpeed);
                System.out.println("Официант принес счет");
                phaser.arriveAndDeregister();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Chef implements Runnable {
        private int cookingSpeed;

        public Chef(int cookingSpeed) {

            this.cookingSpeed = cookingSpeed;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(cookingSpeed);
                System.out.println("Заказ готов");
                phaser.arriveAndDeregister();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


