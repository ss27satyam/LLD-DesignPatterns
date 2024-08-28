package StrategyPattern;

public class MergeSortingStrategy implements ISortingStrategy{
    @Override
    public void sort( int[] array ){
        System.out.println( "Sorting Using Merge Sort" );
    }
}
