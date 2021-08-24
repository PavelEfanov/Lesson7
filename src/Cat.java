public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate myPlate) {
        if (myPlate.enoughFood(appetite) && !fullness) {
            myPlate.decreaseFood(appetite);
            this.fullness = true;
        } else if (fullness){
            System.out.println("Я сейчас лопну");
        } else {
            System.out.println("Мало еды есть не буду бе");
        }

    }

    public void amIFull() {
        System.out.println(name + " " + fullness);
    }
}
