
#描述一个节点
class Node:
    def __init__(self, data=None, next=None):
        self.__data = data
        self.__next = next
    def set_data(self, data):
        self.__data = data
    def set_next(self, next):
        self.__next = next
    def get_data(self):
        return self.__data
    def get_next(self):
        return self.__next

#描述一个单向链表
class LinkList:
        def __init__(self, head=None, tail=None, length=0):
            self.__head = head
            self.__tail = tail
            self.__length = length
        #头插法
        def add(self, data):
            # 创建一个节点
            new_node = Node(data)
            # 如果链表为空
            if self.is_empty():
                self.__head = new_node
                self.__tail = new_node
                self.__length += 1
                return None
            #将new_node 的next指向链表的head
            new_node.set_next(self.__head)
            #将链表的head指向new_node
            self.__head = new_node
            self.__length += 1

        #尾插法
        def append(self, data):
            #创建一个节点
            new_node = Node(data)
            #如果链表为空
            if self.is_empty():
                self.__head = new_node
                self.__tail = new_node
                self.__length += 1
                return None
            #将tail的next指向new_node
            self.__tail.set_next(new_node)
            #将tail指向new_node
            self.__tail = new_node
            self.__length += 1

        #在指定位置插入一个元素
        def insert_pos(self, pos, data):
            if pos == 0:
                self.add(data)
                return None

            tmp = self.__head
            for x in range(pos-1):
                tmp = tmp.get_next()
            new_node = Node(data)
            new_node.set_next(tmp.get_next())
            tmp.set_next(new_node)

        #在指定位置删除一个元素
        def remove_pos(self, pos, data):
            pass
        #删除指定的元素
        def remove_data(self, data):
            #用tmp指向链表的head
            tmp = self.__head
            pre = self.__head
            while tmp != None:
                while tmp.get_data() != data and tmp != None:
                    pre = tmp
                    tmp = tmp.get_next()
                if tmp == None:
                    break
                #如果删除的节点是头部
                if tmp == self.__head:
                    self.__head = tmp.get_next()

                elif tmp == self.__tail: #如果删除的节点是尾部
                    self.__tail = pre
                else:
                    pre.set_next(tmp.get_next())
                del tmp
                self.__length -= 1
                tmp = pre.get_next()

        #判断链表是否为空
        def is_empty(self):
            return self.__head == None
        def print_list(self):
            #用一个临时指针指向链表的头节点
            tmp = self.__head
            while tmp != None:
                print(tmp.get_data())
                tmp = tmp.get_next()

if __name__ == '__main__':
    #创建一个空链表
    l = LinkList()

    for x in range(10):
        #l.append(x)
        l.add(x)
    l.print_list()