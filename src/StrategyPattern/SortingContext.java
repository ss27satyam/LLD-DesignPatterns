package StrategyPattern;

public class SortingContext {
    private ISortingStrategy strategy_;

    public SortingContext( ISortingStrategy strategy ){
        this.strategy_ = strategy;
    }

    public void setStrategy( ISortingStrategy strategy ) {
        this.strategy_ = strategy;
    }

    public void performSorting( int[] array ){
        this.strategy_.sort( array );
    }
}
