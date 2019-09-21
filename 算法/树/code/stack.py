class Stack(object):
    def __init__(self):
        self.data = []
        self.length = 0

    #如果栈为空返回True 否则返回False
    def is_empty(self):
        if self.length > 0:
            return False
        else:
            return True
    #入栈
    def push(self, item):
        self.data.insert(0, item)
        self.length += 1

    #出栈
    def pop(self):
        #判断栈是否为空
        if self.is_empty():
            return None

        item = self.data[0]
        #删除第0个元素
        self.data.pop(0)
        self.length -= 1

        return item

    #获得栈顶元素
    def get_top_data(self):
        if self.is_empty():
            return None
        return self.data[0]

    def print_stack(self):
        print("**** start stack ****")
        for x in self.data:
            print(x)
        print("**** end stack ****")

# if __name__ == "__main__":
#     s = Stack()
#
#     for i in range(10):
#         s.push(i)
#
#     for i in range(10):
#         print(s.pop())