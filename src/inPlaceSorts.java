public class inPlaceSorts {

    public static void swapString(String[] list1, int i, int j) {
        String temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static void swapDouble(double[] list1, int i, int j) {
        double temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static void swapInt(int[] list1, int i, int j) {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static double[] selectionSort(double[] list1) {
        int minPos;
        for (int curPos = 0; curPos < list1.length -1; curPos++) {
            double minVal = list1[curPos];
            minPos = curPos;
            for (int i = curPos + 1; i < list1.length; i++)
            {
                if (list1[i] < minVal) {
                    minVal = list1[i];
                    minPos = i;
                }
            }
            swapDouble(list1, curPos, minPos);
        }
        return list1;
    }



    public static void bubbleSort(String[] list1) {
        int x=list1.length;
        int y=-1;
        while(y!=0) {
            y=0;
            for(int j=0; j<x-1;j++){
                if(list1[j].compareTo(list1[j+1]) >0) {
                    inPlaceSorts.swapString(list1,j,j+1);
                    y= y+1;
                }
            }
        }
    }

    public static void insertionSort(int[] list1) {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = i; j >0; j--)
            {
                if (list1[j] < list1[j - 1])
                {
                    swapInt(list1, j, j - 1);
                }
                else {
                    j = 0;
                }
            }
        }
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static double[] randomDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (Math.random()*1000);
        }
        return arr;
    }

    public static int[] randomIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*1000);
        }
        return arr;
    }


    public static String printStringArray(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + "[" + arr[i] + "] ";
        }
        return result;
    }

    public static String printDoubleArray(double[] list1) {
        String result = "";

        for (double num : list1) {
            result = result + " " + num;
        }
        return result;
    }

    public static String printIntArray(int[] list1) {
        String result = "";

        for (int num : list1) {
            result = result + " " + num;
        }
        return result;
    }
}

