public class Lesson7 {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Барсик", 40);
        Plate firstPlate = new Plate(50);

        firstCat.amIFull();
        firstPlate.howMuchFood();
        firstCat.eat(firstPlate);
        firstCat.amIFull();
        firstPlate.howMuchFood();
        firstPlate.addSomeFood(20);
        firstPlate.howMuchFood();
        firstCat.eat(firstPlate);
        firstCat.amIFull();

        Cat[] catArray = {new Cat("Соня", 14), new Cat("Вася", 10), new Cat("Жуля", 22), new Cat("Митти", 13)};

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(firstPlate);
            catArray[i].amIFull();
        }
    }
}
//DONE
