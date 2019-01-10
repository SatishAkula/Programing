import threading
from threading import Thread
def Calculate1(arr=[]):
    total=0
    for i in range(0,len(arr)):
        if i%2==0:
            total=total+arr[i]
            print(total)
            print("in 1")
    print(total)
def Calculate2(arr=[]):
    total=0
    for i in range(0,len(arr)):
        if i%2!=0:
            total=total+arr[i]
            print(total)
            print("in 2")
    print(total)


if __name__ == "__main__": 
    arr=[1,2,3,4,5,6,7,8,9,10];
    Thread(target=Calculate1(arr)).start()
    Thread(target=Calculate2(arr)).start()
