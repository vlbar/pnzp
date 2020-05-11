package com.vlsu.lab08.sorting;

public class QuickSort {
    public static void sort(int[] arr)
    {
        sortRecursion(arr, 0, arr.length - 1);
    }

    private  static void sortRecursion(int[] arr, int left, int right)
    {
        if (left < right)
        {
            //опорный элемент
            int pivot = partition(arr, left, right);
            sortRecursion(arr, left, pivot - 1);
            sortRecursion(arr, pivot + 1, right);
        }
    }

    //разбиение (перераспределние элементов так, что элементы меньше опорного перемещаются перед ним, а большие или равные после)
    private static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int middle = left;
        for (int  i = left; i < right; i++)
        {
            if (arr[i] <= pivot)
            {
                swap(arr, i, middle);
                middle++;
            }
        }

        swap(arr, middle, right);
        return middle;
    }

    private static void swap (int[] arr, int a, int b)
    {
        if(a != b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
