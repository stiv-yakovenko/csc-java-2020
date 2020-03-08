package org.csc.nsk.java2020.task01.arrays;

public final class Main {

    private Main() {
    }

    /**
     * Перевернуть поданный на вход массив.
     *
     * @param array массив элементов
     * @return массив с перевернутыми элементами
     */
    public static int[] reverse(final int[] array) {
        return array;
    }

    /**
     * Найти минимальный элемент элемент массива.
     *
     * @param array массив элементов
     * @return минимальный элемент (в случае пустого массива - 0)
     */
    public static int min(final int[] array) {
        var minimum = Integer.MAX_VALUE;
        return minimum;
    }

    /**
     * Найти максимальный элемент в массива.
     *
     * @param array массив элементов
     * @return максимальный элемент (в случае пустого массива - 0)
     */
    public static int max(final int[] array) {
        var maximum = Integer.MIN_VALUE;
        return maximum;
    }

    /**
     * Вычислить среднее значение элементов массива.
     *
     * @param array массив элементов
     * @return среднее значение (в случае пустого массива - 0)
     */
    public static double average(final int[] array) {
         return 0;
    }

    /**
     * Вычислить медианный элемент массива.
     * @see <a href="en.wikipedia.org/wiki/Median"/>
     *
     * @param array массив элементов
     * @return среднее значение (в случае пустого массива - 0)
     */
    public static double median(final int[] array) {
        return 0.0;
    }

    /**
     * Сортировка массива пузырьком. Производится in-place.
     * @see <a href="en.wikipedia.org/wiki/Bubble_sort"/>
     *
     * @param array массив для сортировки
     */
    public static void bubbleSort(final int[] array) {
    }

    /**
     * Вычислить наибольшую непрерывную возрастающую подпоследовательность.
     *
     * @param array последовательность целых чисел
     * @return наибольшая по размеру непрерывная возрастающая подпоследовательность
     * заданной последовательности.
     * Если кандидатов несколько, возвращается самая близкая к началу последовательности.
     * Если последовательность задана пустым массивом, то возвращается пустой массив.
     */
    public static int[] longestAscendingSubsequence(final int[] array) {
        var result = new int[0];
        return result;
    }
}
