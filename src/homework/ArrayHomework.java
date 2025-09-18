package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 6, 6, 2, 8, 6, 0, 6};
        int n = 6;

        // задача1
        int count = 0;
        for (int num : numbers) {
            if (num == n) {
                count++;
            }
        }
        System.out.println("Number " + n + " occurs " + count + " times");

        // задача2
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("\nReversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // задача3
        int duplicateCount = 0;
        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) continue;
            int currentCount = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    currentCount++;
                    visited[j] = true;
                }
            }
            if (currentCount > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);



// задача4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        int count1 = 0;

        for (char ch : chars) {
            if (ch == 'ա' || ch == 'ե' || ch == 'ը' || ch == 'ի' || ch == 'ո' || ch == 'ւ' || ch == 'օ') {
                count++;
            }
        }

        System.out.println("Number of vowels։" + count);
    }
}
