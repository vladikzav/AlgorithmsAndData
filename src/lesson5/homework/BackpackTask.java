package lesson5.homework;

public class BackpackTask {
    static final int MAX_WEIGHT = 15;

    public static void main(String[] args) {
        System.out.println(bestPrice(items.length - 1, MAX_WEIGHT));
    }

    static Item[] items = {
            new Item(4, 12),
            new Item(2, 2),
            new Item(2, 1),
            new Item(1, 1),
            new Item(10, 4)
    };


    private static int bestPrice(int i, int weigth) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weigth) {
            return bestPrice(i-1, weigth);
        }
        else {
            return Math.max(bestPrice(i-1, weigth), bestPrice(i-1, weigth - items[i].getWeight()) + items[i].getPrice());
        }
    }

    static class Item {
        private int price;
        private int weight;

        public Item(int price, int weight) {
            this.price = price;
            this.weight = weight;
        }

        public int getPrice() {
            return price;
        }

        public int getWeight() {
            return weight;
        }

    }


}
