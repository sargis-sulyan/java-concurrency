public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Haf Haf");
    }

    @Override
    public void makeSound5Times() {
        for (int i = 0; i < 5; i++) {
            makeSound();
            try {
                Thread.sleep(10);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return;
    }
}
