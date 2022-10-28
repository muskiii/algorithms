package com.prontera.algorithms.entity.algorithm;

public class MergeSortAlgorithm extends SortingAlgorithm {

    private static final  String NAME = "Merge Sort";
    private static final  String DESCRIPTION = "In computer science, merge sort (also commonly spelled mergesort) is a comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Mergesort is a divide and conquer algorithm. Divide and conquer algorithms divide the original data into smaller sets of data to solve the problem.\n" +
            "\n" +
            "During the Mergesort process the object in the collection are divided into two collections. To split a collection, Mergesort will take the middle of the collection and split the collection into its left and its right part. The resulting collections are again recursively splitted via the Mergesort algorithm until they are broke to single element in each collection.\n" +
            "\n" +
            "After splitting each collection, mergesort algorithm start combining all collections obtained via above procedure. To combine both collections Mergesort start at each collection at the beginning. It pick the object which is smaller and inserts this object into the new collection. For this collection it now selects the next elements and selects the smaller element from both collection by comparing one element from each collection at a time.\n" +
            "\n" +
            "This process create a collection of sorted elements (subset of all elements which needs to be sorted). This process is recursively done for all available collections obtained in first step i.e. splitting the collections.\n" +
            "\n" +
            "Once all elements from both collections have been inserted in the new collection, Mergesort has successfully sorted the collection.\n" +
            "\n" +
            "To avoid the creation of too many collections, typically only one new collection is created and the new one and existing one are treated as different collections.";
    private static final  String COMPLEXITY = "O(n log n)";

    public MergeSortAlgorithm() {
        super(NAME, DESCRIPTION, COMPLEXITY);
    }

    @Override
    public Integer[] run(Integer[] array) {
        return array;
    }
}
