from random import randint
from Searching import linearSearch, jumpSearch
from BinarySearch import BinarySearch

sortedList = list(range(1,100))
searchValue = randint(1,999)
stepSize = randint(1,99)
searchVal = randint(1,999)
lenght = len(sortedList)

def testLinearSearch(benchmark):
    benchmark(linearSearch, sortedList, searchValue)

def testJumpSearch(benchmark):
    benchmark(jumpSearch, sortedList, searchValue, stepSize)

def testBinarySearch(benchmark):
    benchmark(BinarySearch, sortedList, 0, lenght-1, searchVal, 1)

    