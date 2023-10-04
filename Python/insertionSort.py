n = int(input("enter the number of elements "))
a=[]
for i in range(n):
    elem = int(input("Enter the number "))
    a.append(elem)

def insertionSort(a):
    for i in range(0,n-1):
        for j in range(i+1,0,-1):
            if a[j-1]>a[j]:
               
               temp=a[j-1]
               a[j-1]=a[j]
               a[j]=temp

            else:
                break   
    return(a)         

print(insertionSort(a))