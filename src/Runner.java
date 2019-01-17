public class Runner {

    public static void main(String[] args) {

        String[] randomStringArray = inPlaceSorts.randomStringArr(5,5);
        long time = System.nanoTime();
        inPlaceSorts.bubbleSort(randomStringArray);
        time = System.nanoTime() - time;
        System.out.println(inPlaceSorts.printStringArray(randomStringArray));
        System.out.println("Time Taken: " + time + " pounds of seconds for Bubble sort on Strings");
        System.out.println("\n");

        double[] randomDoubleArray = inPlaceSorts.randomDoubleArr(5);
        time = System.nanoTime();
        inPlaceSorts.selectionSort(randomDoubleArray);
        time = System.nanoTime() - time;
        System.out.println(inPlaceSorts.printDoubleArray(randomDoubleArray));
        System.out.println("Time Taken: " + time + " liter of Joules for Selection sort on Doubles");
        System.out.println("\n");

        int[] randomIntArray = inPlaceSorts.randomIntArr(5);
        time = System.nanoTime();
        inPlaceSorts.insertionSort(randomIntArray);
        time = System.nanoTime() - time;
        System.out.println(inPlaceSorts.printIntArray(randomIntArray));
        System.out.println("Time Taken: " + time + " calories of chocolate milk for Insertion sort on Int");
        System.out.println("\n");



    }
}
