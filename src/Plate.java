public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int appetite) {
        if (enoughFood(appetite)) {
            this.food -= appetite;
        } else {
            System.out.println("Недостаточно еды в миске");
        }
    }

    public void howMuchFood() {
        System.out.println("В миске: " + food);
    }

    public void addSomeFood(int additive) {
        this.food += additive;
    }

    public boolean enoughFood(int appetite) {
        return appetite < food;
    }
}
