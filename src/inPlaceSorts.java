public class inPlaceSorts {

    public static void selectionSort(double[] list1 ) {
        int minPos=0;
        for(int curPos=0;curPos<list1.length-1;curPos++) {
            double minV= list1[curPos];
            minPos= curPos;
            for(int i= curPos+1; i<list1.length;i++) {
                if(list1[i]<minV) {
                    minV= list1[i];
                    minPos=i;
                }
                double temp= list1[i];
                list1[i]= list1[i+1];
                list1[i+1] = temp;
            }

        }



    }

    public static void bubbleSort(String[] list1) {
        int x=list1.length;
        for(int i=0; i<x-1; i++) {
            for(int j=0; j<x-i-1;j++){
                if(list1[j].compareTo(list1[j+1]) > 0)  {
                    String temp= list1[j];
                    list1[j]= list1[j+1];
                    list1[j+1] = temp;

                }
            }
        }
    }

    public static void insertionSort(int[] list1) {

    }



}
