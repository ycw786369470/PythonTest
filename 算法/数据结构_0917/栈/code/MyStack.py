import random

class Stack:
    def __init__(self):
        self.data = []
        self.length = 0
    #入栈: 先栈中插入一个元素
    def push(self, item):
        #在第0个位置插入元素
        self.data.insert(0, item)
        self.length += 1
    #出栈
    def pop(self):
        if self.is_empty():
            return None
        #取出第0个元素
        item = self.data[0]
        # 删除第0个元素
        self.data.pop(0)
        self.length -= 1
        return item
    #判断栈是否为空，如果为空则返回True，否则返回False
    def is_empty(self):
        if self.length == 0:
            return True
        else:
            return False

    def print_stack(self):
        print(self.data)

# if __name__ == '__main__':
#     s = Stack()
#     #在一个栈中插入 10个元素，这10元素是1~100之间的随机值
#     data = [s.push(random.randint(1, 100)) for x in range(10)]
#     # print(data)
#     #
#     # s = Stack()
#     #
#     # for item in data:
#     #     s.push(item)
#
#     s.print_stack()