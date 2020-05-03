from typing import Tuple

l=[1,2,6,8,19,21,23]

def linearSearch(sortedList: list, value: int) -> Tuple[bool,int]:
    for i in range(0,len(sortedList)):
        if sortedList[i]==value:
            return True,i

    return False,-1

def jumpSearch(sortedList:list, value:int, stepSize:int) -> Tuple[bool,int]:
    for i in range(0,len(sortedList),stepSize):
        if sortedList[i]>value:
            for j in range(i - stepSize, i):
                if sortedList[j] == value:
                    return True, j
            return False, -1
    for k in range(len(sortedList)-stepSize, len(sortedList)):
        if sortedList[k] == value:
            return True, k
    return False, -1

print(linearSearch(l,23))
print(jumpSearch(l,23,4))