from random import sample
from Sorting import selectionSort, bubbleSort
from Sort import InsertionSort, MergeSort

unsortedList =  sample(range(1,1000), 999)
sortedList = list(range(1,1000))

def testSelectionSort(benchmark):
    result1 = benchmark(selectionSort, unsortedList)
    assert result1 == sortedList

def testBubbleSort(benchmark):
    result2 = benchmark(bubbleSort, unsortedList)
    assert result2 == sortedList

def testInsertionSort(benchmark):
    result3 = benchmark(InsertionSort, unsortedList)
    assert result3 == sortedList

def testMergeeSort(benchmark):
    result4 = benchmark(MergeSort, unsortedList)
    assert result4 == sortedList