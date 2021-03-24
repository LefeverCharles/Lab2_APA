package heapsort.test;
import heapsortcode.HeapSort;
import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

class HeapSortTest {

    @org.junit.jupiter.api.Test
    void testBuildheap() {
        int[] input = {5,10,13,6,12,15,8};
        int[] output = {15,12,13,6,10,5,8};
        HeapSort.buildheap(input);
        assertArrayEquals(output,input);
        int[] input2 = {15,12,13,6,10,5,8};
        int[] output2 = {15,12,13,6,10,5,8};
        HeapSort.buildheap(input2);
        assertArrayEquals(output2,input2);
    }

    @org.junit.jupiter.api.Test
    void testHeapify() {
        int[] input = {15,13,12,10,11,4,14};
        int[] output = {15,13,14,10,11,4,12};
        HeapSort.heapify(input,2,7);
        assertArrayEquals(output,input);
        int[] input2 = {15,13,14,10,11,4,9};
        int[] output2 = {15,13,14,10,11,4,9};
        HeapSort.heapify(input2,2,7);
        assertArrayEquals(output2,input2);
    }

    @org.junit.jupiter.api.Test
    void testHeapSort() {
        int[] input = {5,10,13,6,12,15,8};
        int[] output = {5,6,8,10,12,13,15};
        HeapSort.heapSort(input);
        assertArrayEquals(output,input);
        HeapSort.heapSort(input);
        assertArrayEquals(output,input);
    }
}