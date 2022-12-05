public class Main {
        public static void main (String[] args) {
            Cat cat1 = new Cat("Kiti", 30);
            Cat cat2 = new Cat("Sharik", 20);
            Cat cat3 = new Cat("Bally", 49);

            Cat[] cats = {cat1, cat2, cat3};
            Plate plate = new Plate(100);

            for (int i = 0; i < cats.length; i++) {
                cats[i].eat(plate);
            }

            plate.info();

            for (int i = 0; i < cats.length; i++) {
                cats[i].info();
            }
        }
    }
