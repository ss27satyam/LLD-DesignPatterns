package StrategyPattern;

public class BubbleSortingStrategy implements ISortingStrategy {
    @Override
    public void sort( int [] array ){
        System.out.println( "Sorting using Bubble sort" );
    }
}
