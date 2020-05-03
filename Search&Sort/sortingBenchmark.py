from random import sample
from Sorting import selectionSort, bubbleSort

unsortedList =  sample(range(1,1000), 999)
sortedList = list(range(1,999))

def testSelectionSort(benchmark):
    result = benchmark(selectionSort, unsortedList)
    assert result == sortedList

def testBubbleSort(benchmark):
    result = benchmark(bubbleSort, unsortedList)
    assert result == sortedList