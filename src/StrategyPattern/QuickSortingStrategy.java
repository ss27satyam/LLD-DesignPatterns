package StrategyPattern;

public class QuickSortingStrategy implements ISortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println( "Sorting using QuickSort" );
    }
}
