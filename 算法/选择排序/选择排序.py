list1 = [30, 5, 4, 13, 15, 9, 20, 17]
n = len(list1)

#选择n-1个最大值1
for x in range(n-1):
    #每次选择出最大值
    max = list1[0]
    index = 0
    for y in range(1, n-x):
        if list1[y] > max:
            max = list1[y]
            #记录最大值的下标
            index = y
    #将相对最大值和相对最后的元素交换
    list1[index], list1[n-1-x] = list1[n-1-x], list1[index]
print(list1)