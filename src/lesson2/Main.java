package lesson2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//
//        for (int i = 0; i < 5 ; i++) {
//            mal.add(i+5);
//        }
//
//        mal.add(1,89);
//
//        System.out.println(mal);
//        mal.remove(3);
//        System.out.println(mal);
//
//        System.out.println(mal.indexOf(6));
//
//        mal.remove(new Integer(8));
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//
//        msal.add(6);
//        msal.add(9);
//        msal.add(2);
//        msal.add(1, 8);
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(88));


//        MyArrayList<Integer> mal = new MyArrayList<>(10);
////
//        for (int i = 0; i < 10 ; i++) {
//            mal.add(rand.nextInt(100));
//        }
//
//        System.out.println(mal);
////        mal.selectionSort();
////        mal.insertionSort();


//        MyArrayList<Box> boxes = new MyArrayList<>(1000001);
//
//        for (int i = 0; i < 1000000; i++) {
//            boxes.add(new Box(rand.nextInt(10), rand.nextInt(10)));
//        }
//        System.out.println(boxes);
//        boxes.bubbleSort(Comparator.comparingInt(a->a.getY()));
//        boxes.bubbleSort(Comparator.comparingInt(a->a.getX()*a.getY()));
//        boxes.bubbleSort((a, b) -> a.getX()- b.getX());
//        boxes.bubbleSort(Comparator.comparing(Box::getY).reversed());
//        boxes.bubbleSort(Comparator.comparingInt(Box::getX));
//        System.out.println(boxes);

        Thread a = new Thread(){

            @Override
            public void run() {
                System.out.println("1");
                System.out.println("Bubble Time: "+bubbleTimeTest());
            }
        };

        Thread b = new Thread(){

            @Override
            public void run() {
                System.out.println("2");
                System.out.println("Selection Time: "+selectionTimeTest());
            }
        };

        Thread c = new Thread(){

            @Override
            public void run() {
                System.out.println("3");
                System.out.println("InsertTime: "+insertTimeTest());
            }
        };

        a.start();
        b.start();
        c.start();
    }

    public static long bubbleTimeTest(){
        MyArrayList<Integer> intList = new MyArrayList<>(1000001);

        for (int i = 0; i < 1000000; i++) {
            intList.add(rand.nextInt(10));
            System.out.println("BTT: "+ i);
        }
        System.out.println("BTT: DONE!!!");
        long timeMillis = System.currentTimeMillis();
        intList.bubbleSort();

        return System.currentTimeMillis() - timeMillis;
    }

    public static long selectionTimeTest(){
        MyArrayList<Integer> intList = new MyArrayList<>(1000001);

        for (int i = 0; i < 1000000; i++) {
            intList.add(rand.nextInt(10));
            System.out.println("STT: "+ i);
        }
        System.out.println("STT: DONE!!!");
        long timeMillis = System.currentTimeMillis();
        intList.selectionSort();

        return System.currentTimeMillis() - timeMillis;
    }

    public static long insertTimeTest(){
        MyArrayList<Integer> intList = new MyArrayList<>(1000001);

        for (int i = 0; i < 1000000; i++) {
            intList.add(rand.nextInt(10));
            System.out.println("ITT: "+ i);
        }
        System.out.println("ITT: DONE!!!");
        long timeMillis = System.currentTimeMillis();
        intList.insertionSort();

        return System.currentTimeMillis() - timeMillis;
    }
}
