from random import randint
from BinarySearch import BinarySearch


sortedList = list(range(1,100))
searchVal = randint(1,999)
lenght = len(sortedList)

def testBinarySearch(benchmark):
    benchmark(BinarySearch, sortedList, 0, lenght-1, searchVal, 1)

