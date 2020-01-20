package lesson6;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();

//        map.put(5,"five");
//        map.put(4,"four");
//        map.put(6,"four");
//        map.put(3,"tree");
//        map.put(2,"two");
//        map.put(1,"one");

//        System.out.println(map.get(1));
//        System.out.println(map.get(2));
//        map.delete(2);
//        System.out.println(map.contains(2));
//
//        System.out.println(map);
//
//        System.out.println(map.height());
//        System.out.println(map.isBalanced());

        MyTreeMap<Integer, Integer>[] maps = new MyTreeMap[20];
        int balanced = 0;
        for (int i = 0; i < maps.length; i++) {
            maps[i] = new MyTreeMap<>();
            treeMapFiller(maps[i]);
            System.out.println("Баланс массива "+ (i+1) + ": " +maps[i].isBalanced());
            if(maps[i].isBalanced())
                balanced+=1;

        }
        System.out.println("Сбалансированных массивов: " + (balanced*5) + "%");

    }

    public static MyTreeMap<Integer, Integer> treeMapFiller(MyTreeMap<Integer, Integer> map){
        while(map.height()<=6){
            int tmp = rnd(-100,100);
            map.put(tmp, tmp);
        }
        return map;
    }

    public static int rnd(int min, int max){
        int diapason = max + Math.abs(min) + 1;
        return  (int) (Math.random() * diapason) - max;
    }
}
