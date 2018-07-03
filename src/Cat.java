public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void makeSound5Times() {
        Object x = null;
        x.toString();
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
