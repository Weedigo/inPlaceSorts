public class Runner {

    public static void main(String[] args) {

        long time= System.nanoTime();

        String[] list1 = {"Byron","Korry","Jas","Harde"};
        inPlaceSorts.bubbleSort(list1);
        time= System.nanoTime() - time;
        System.out.println(inPlaceSorts.printArray(list1));
        System.out.println("Time taken: " + time);

        inPlaceSorts.printIntArr(list1);
        time=System.nanoTime()- time;
        System.out.println(inPlaceSorts.printArray(list1));
        System.out.println("Time taken " + time);




    }
}
