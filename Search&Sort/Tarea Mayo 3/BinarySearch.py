# No funciona si el elemento no esta el la lista
def BinarySearch(sortedArray,num,lenghtt,element,steps):
    half = num + (lenghtt - 1) // 2
    if(element in sortedArray):
        if(sortedArray[half] == element):
            return "Found in "+ str(steps) + " rounds"

        elif(element < sortedArray[half]):
            steps += 1
            return BinarySearch(sortedArray,num,half-1,element,steps)

        elif(element >= sortedArray[half]):
            steps += 1
            return BinarySearch(sortedArray,half+1,lenghtt,element,steps)

    else:
        return "NotFound"

sortedArray = [0,2,4,5,7,9]
element = 7
lenght = len(sortedArray)
print(BinarySearch(sortedArray,0,lenght-1,element,1))
