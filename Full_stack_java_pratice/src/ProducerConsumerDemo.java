class ProducerConsumer {

    int item;
    boolean produced = false;

    public synchronized void produce(int value) throws Exception {

        while (produced) {
            wait();
        }

        item = value;

        System.out.println("Produced : " + item);

        produced = true;

        notify();
    }

    public synchronized void consume() throws Exception {

        while (!produced) {
            wait();
        }

        System.out.println("Consumed : " + item);

        produced = false;

        notify();
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    pc.produce(i);
                } catch (Exception e) {}
            }

        });

        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    pc.consume();
                } catch (Exception e) {}
            }

        });

        producer.start();
        consumer.start();
    }
}