public class inPlaceSorts {

    public static void selectionSort(double[] list1) {
        int minPos = 0;
        for (int curPos = 0; curPos < list1.length - 1; curPos++) {
            double minV = list1[curPos];
            minPos = curPos;
            for (int i = curPos + 1; i < list1.length; i++) {
                if (list1[i] < minV) {
                    minV = list1[i];
                    minPos = i;
                }
                double temp = list1[i];
                list1[i] = list1[i + 1];
                list1[i + 1] = temp;
            }

        }


    }

    public static void bubbleSort(String[] list1) {
        int x = list1.length;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (list1[j].compareTo(list1[j + 1]) > 0) {
                    helper.swap(list1,i,j);

                }
            }
        }
    }

    public static void insertionSort(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = i; j < list1.length; i--) {
                if (list1[j] < list1[j - 1]) {
                    int temp = list1[j];
                    list1[i] = list1[i - 1];
                    list1[i - 1] = temp;
                } else {
                    j = 0;
                }


            }
        }
    }

        public String[] randomStringArr ( int num, int length){
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


    public static String printArray(String[] arr)
    {
        String result = "";
        for(int i=0; i<arr.length; i++)
        {
            result = result + "[" + arr[i] + "] ";
        }
        return result;
    }


}
