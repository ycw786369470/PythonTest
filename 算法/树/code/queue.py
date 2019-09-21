class Queue(object):
    def __init__(self):
        self.data = []
        self.length = 0

    #如果队列为空返回True 否则返回False
    def is_empty(self):
        if self.length > 0:
            return False
        else:
            return True
    #入队
    def enqueue(self, item):
        self.data.append(item)
        self.length += 1

    #出队
    def dequeue(self):
        #判断队列是否为空
        if self.is_empty():
            return None

        item = self.data[0]
        #删除第0个元素
        self.data.pop(0)
        self.length -= 1

        return item

    #获得队列顶元素
    def get_top_data(self):
        if self.is_empty():
            return None
        return self.data[0]

    def print_queue(self):
        print("**** start stack ****")
        for x in self.data:
            print(x)
        print("**** end stack ****")
