# QUICK SORT
def Pivot(array,small,tall):
    sIndex = small - 1
    piv = array[tall]

    for i in range(small , tall):
        if array[i] < piv:
            sIndex += 1
            array[sIndex], array[i] = array[i], array[sIndex]

    array[sIndex+1], array[tall] = array[tall], array[sIndex+1]
    return sIndex+1

def QuickSort(array,small,tall):
    if small < tall:
        pIndex = Pivot(array,small,tall)
        QuickSort(array,small,pIndex-1)
        QuickSort(array,pIndex+1,tall)
    
########
#INSERTION SORT
def InsertionSort(array):
    for i in range(1, len(array)):
        key = array[i]
        num = i - 1
        while (num >= 0) and (key < array[num]):
            array[num+1] = array[num]
            num -= 1
        array[num+1] = key

def MergeSort(array):
    if len(array) > 1:
        half = len(array) //2
        left = array[:half]
        right = array[half:]
        # indexL = 0
        # indexR = 0
        # for i in range(0,half-1):
        #     left[indexL] = array[i]
        #     indexL += 1
        # for i in range(half,len(array)-1):
        #     right[indexR] = array[i]
        #     indexR += 1

        MergeSort(right)
        MergeSort(left)

        indexL = 0
        indexR = 0
        k = 0
        while indexL < len(left) and indexR < len(right): 
            if left[indexL] < right[indexR]: 
                array[k] = left[indexL] 
                indexL += 1
            else: 
                array[k] = right[indexR] 
                indexR += 1
            k += 1
          
        while indexL < len(left): 
            array[k] = left[indexL] 
            indexL += 1
            k += 1
          
        while indexR < len(right): 
            array[k] = right[indexR] 
            indexR += 1
            k += 1

def printList(array): 
    for i in range(len(array)):         
        print(array[i],end=" ") 
    print() 
  
if __name__ == '__main__': 
    array = [15, 22, 1, 9, 6, 67]  
    length = len(array) 

    print ("Array is")  
    printList(array) 
    print("")
    
    QuickSort(array,0,length-1)
    print("Quick Sort array is: ") 
    printList(array)
    print("")
 
    InsertionSort(array)
    print("Inserion Sort array is: ") 
    printList(array) 
    print("")
    
    MergeSort(array) 
    print("Merge Sort array is: ") 
    printList(array) 
    print("")


