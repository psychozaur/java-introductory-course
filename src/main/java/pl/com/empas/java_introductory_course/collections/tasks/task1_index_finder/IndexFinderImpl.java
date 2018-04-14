package pl.com.empas.java_introductory_course.collections.tasks.task1_index_finder;

import pl.com.empas.java_introductory_course.collections.common.FruitGenerator;

import java.util.List;

public class IndexFinderImpl<E> implements IndexFinder<E> {


    /*
    Create implementation of the IndexFinder interface.

     */
    @Override
    public Integer findFirstIndexOf(E elem, List<E> list) {
        return null;
    }

    @Override
    public List<Integer> findAllIndexesOf(E element, List<E> list) {
        return null;
    }


    public static void main(String args []) {
        IndexFinderImpl<String> indexFinder = new IndexFinderImpl<>();
        List<String> fruitList = FruitGenerator.getFruitList();

        int orangeIndex = indexFinder.findFirstIndexOf("Orange", fruitList);
        int carrotIndex = indexFinder.findFirstIndexOf("Carrot", fruitList);

        System.out.println("List index of 'Orange' is: " + orangeIndex);
        System.out.println("List index of 'Carrot' is: " + carrotIndex);

        //---------------------------
        List<Integer> orangeIndexes = indexFinder.findAllIndexesOf("Orange", fruitList);
        List<Integer> carrotIndexes = indexFinder.findAllIndexesOf("Carrot", fruitList);
        System.out.println("All indexes of 'Orange' are: " + orangeIndex);
        System.out.println("All indexes of 'Carrot' are: " + carrotIndex);
    }
}
