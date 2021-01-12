package math;

public class MMM {
    public static void calculate(int[] x, int n) {
        //sort whole array
        int tmp;
        for (int a = 0; a < n - 1; a++) {
            for (int i = a + 1; i < n; i++) {
                if (x[a] > x[i]) {
                    tmp = x[a];
                    x[a] = x[i];
                    x[i] = tmp;
                }
            }
        }
        //calculate mean
        double sum = 0;
        for (int i = 0; i < n; i++) {
            //int add=0;
            sum += x[i];
        }
        System.out.println( sum / n);

        //calculate median
        double median = 0;
        if (n % 2 == 0) {//if array has even number of numbers
            for (int i = 0; i < n; i++) {
                median = ((double) x[n / 2] + (double) x[n / 2 - 1]) / 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                median = x[(n - 1) / 2];
            }
        }
        System.out.println( median);
        //calculate mode
        int maxValue=0;
        int maxCount=0;

        for(int i=0; i<n; ++i)
        {
            int count=0;

            for(int j=0; j<n; ++j)
            {
                if(x[j] == x[i])
                {
                    ++count;
                }

                if(count > maxCount)
                {
                    maxCount = count;
                    maxValue = x[i];
                }
            }
        }
        System.out.println(maxValue);

    }
}
