from random import randint
        

def mergesort(arr):
    
    if len(arr) > 1:
        half = int(len(arr)/2)
        arr1 = arr[0:half]
        arr2 = arr[half:len(arr)]
        return merge(mergesort(arr1), mergesort(arr2))
    else:
        return arr

def merge(arr1, arr2):
    if (arr2 is None):
        arr2 = []
    if (arr1 is None):
        arr1 = []
    res = []
    while (len(arr1) > 0 or len(arr2) > 0):
        if len(arr1) == 0:
            res.append(arr2[0])
            arr2.remove(arr2[0])
        elif len(arr2) == 0:
            res.append(arr1[0])
            arr1.remove(arr1[0])
        elif arr1[0]<arr2[0]:
            res.append(arr1[0])
            arr1.remove(arr1[0])
        else:
            res.append(arr2[0])
            arr2.remove(arr2[0])

    #print(res)
    return res
    

print("hello")
list1 = []
for n in range(10):
    list1.append(randint(0,1000))

print(list1)
l  =mergesort(list1)
print(l)
