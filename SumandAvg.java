class SumandAvg {
    public static void main(String args[]) {
        int sum = 0;
        float avg;
        
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }

        avg = (float) sum / 10;

        System.out.println("Sum of the first 10 numbers is: " + sum);
        System.out.println("Average of the first 10 numbers is: " + avg);
    }
}
