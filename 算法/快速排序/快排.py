
def quick_sort(list1, left, right):
    #左右下标
    if left >= right:
        return None
    n = left
    m = right
    #基准值
    base = list1[n]
    while n < m:
        #从右边往左边找一个比base小的
        while list1[m]>=base and n < m:
            m -= 1
        if n == m:
            list1[n] = base
        else:
            #拿小的值填前面的坑
            list1[n] = list1[m]

        #从左边往右边找一个比base大的
        while list1[n]<=base and n < m:
            n += 1
        if n == m:
            list1[n] = base
        else:
            list1[m] = list1[n]

    #对左边的进行快排
    quick_sort(list1, left, n-1)
    #对右边的进行快排
    quick_sort(list1, n+1, right)

if __name__ == '__main__':
    list1 = [30, 5, 4, 13, 15, 9, 20, 17, 40, 31]
    quick_sort(list1, 0, len(list1) - 1)
    print(list1)