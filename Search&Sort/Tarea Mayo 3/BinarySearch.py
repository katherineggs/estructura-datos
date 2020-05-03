
def BinarySearch(sortedArray,num,lenghtt,element,steps):

    add = num + lenghtt
    half = add // 2

    if(element in sortedArray):

        if(sortedArray[half] == element):
            return "Found "+ str(element) +" in "+ str(steps) + " rounds"

        elif(element < sortedArray[half]):
            steps += 1
            lenghtt = half - 1
            return BinarySearch(sortedArray,num,lenghtt,element,steps)

        elif(element > sortedArray[half]):
            steps += 1
            num = half +1
            return BinarySearch(sortedArray,num,lenghtt,element,steps)

    else:
        return "NotFound"

sortedArray = [0,2,4,5,7,9]
element = int(input("Element to find: "))
lenght = len(sortedArray)
print(BinarySearch(sortedArray,0,lenght-1,element,1))
