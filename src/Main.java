import unsynch.Bank;

public class Main {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        /*Animal dog = new Dog();
        Animal cat = new Cat();

        Runnable r1 = dog::makeSound5Times;
        Runnable r2 = cat::makeSound5Times;

        Thread dogThread = new Thread(r1);
        Thread catThread = new Thread(r2);

        Thread.UncaughtExceptionHandler ueh = (thread, throwable) -> {
            if(throwable.getClass() == NullPointerException.class) {
                System.out.println("NullPointer");
            }
        };

        catThread.setUncaughtExceptionHandler(ueh);

        dogThread.start();
        catThread.start();*/

        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try
                {
                    while (true)
                    {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                }
                catch (InterruptedException e)
                {
                }
            };

            Thread t = new Thread(r);
            t .start();
        }

    }
}
