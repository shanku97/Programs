// Write a multithreaded program to print the FizzBuzz sequence up to n, where:
// One thread prints "Fizz" for multiples of 3.
// One thread prints "Buzz" for multiples of 5.
// One prints "FizzBuzz" for multiples of 15.
// One prints the numbers.




public class MultithreadedFizzBuzz {
private int n;
private int current = 1;

public MultithreadedFizzBuzz(int n) {
    this.n = n;
}

public synchronized void fizz() throws InterruptedException {
    while (current <= n) {
        while (current <= n && (current % 3 != 0 || current % 15 == 0)) {
            wait();
        }
        if (current <= n) {
            System.out.println("Fizz");
            current++;
            notifyAll();
        }
    }
}

public synchronized void buzz() throws InterruptedException {
    while (current <= n) {
        while (current <= n && (current % 5 != 0 || current % 15 == 0)) {
            wait();
        }
        if (current <= n) {
            System.out.println("Buzz");
            current++;
            notifyAll();
        }
    }
}

public synchronized void fizzbuzz() throws InterruptedException {
    while (current <= n) {
        while (current <= n && current % 15 != 0) {
            wait();
        }
        if (current <= n) {
            System.out.println("FizzBuzz");
            current++;
            notifyAll();
        }
    }
}

public synchronized void number() throws InterruptedException {
    while (current <= n) {
        while (current <= n && (current % 3 == 0 || current % 5 == 0)) {
            wait();
        }
        if (current <= n) {
            System.out.println(current);
            current++;
            notifyAll();
        }
    }
}

public static void main(String[] args) {
    int n = 20;
    MultithreadedFizzBuzz fb = new MultithreadedFizzBuzz(n);

    Thread t1 = new Thread(() -> {
        try {
            fb.fizz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread t2 = new Thread(() -> {
        try {
            fb.buzz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread t3 = new Thread(() -> {
        try {
            fb.fizzbuzz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread t4 = new Thread(() -> {
        try {
            fb.number();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    t1.start();
    t2.start();
    t3.start();
    t4.start();
}
}