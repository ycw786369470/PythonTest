list1 = [10, 5, 4, 13, 15, 9, 20, 17]
n = len(list1)

#比较的趟数 n-1趟
for x in range(n-1):
	#每趟比较的逻辑：前后两个元素比较大小，如果前面的元素比后面的大，则交换位置
	for y in range(n-1-x):
		if list1[y] > list1[y+1]:
			list1[y], list1[y+1] = list1[y+1], list1[y]
print(list1)