from random import randint
from searching import linearSearch, jumpSearch

sortedList = list(range(1,100))
searchValue = randint(1,999)

def testLinearSearch(benchmark):
    benchmark(linearSearch, sortedList, searchValue)

def testJumpSearch(benchmark):
    benchmark(jumpSearch, sortedList, searchValue)
    