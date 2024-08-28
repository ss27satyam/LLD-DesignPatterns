package StrategyPattern;

public class Client {
   public static void main ( String[] args ){
       SortingContext sortingCtx = new SortingContext( new BubbleSortingStrategy() );
       int[] arr = { 1,5,10, 6 };
       sortingCtx.performSorting( arr );

       arr = new int[]{100, 5, 10, 20};
       sortingCtx.setStrategy( new MergeSortingStrategy() );
       sortingCtx.performSorting( arr);

       arr = new int[]{ -1, -100, 9, 16 };
       sortingCtx.setStrategy( new QuickSortingStrategy() );
       sortingCtx.performSorting( arr );
   }
}
