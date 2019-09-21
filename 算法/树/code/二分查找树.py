#二分查找树 / 二叉排序树
import random
from stack import Stack
from queue import Queue

class Node:
    def __init__(self, data=None, lchild=None, rchild=None, parent=None):
        self.data = data
        self.lchild = lchild
        self.rchild = rchild
        self.parent = parent

    #判断该节点是否有左子树
    def has_lchild(self):
        return self.lchild

    #判断该节点是否有右子树
    def has_rchild(self):
        return self.rchild

#描述一颗二分查找树
#binary sort/search Tree
class BST:
    def __init__(self, root=None, size=0):
        #根节点
        self.root = root
        #树的节点数树
        self.size = size

    def _insert(self, root, data):
        # 如果data比根节点小 则需要插入左边
        if data < root.data:
            if root.has_lchild() == None:  # 没有左子树
                new_node = Node(data, parent=root)
                root.lchild = new_node
                self.size += 1
                return None
            else:
                self._insert(root.lchild, data)
        else: # 如果data比根节点大 则需要插入左边
            if root.has_rchild() == None:
                new_node = Node(data, parent=root)
                root.rchild = new_node
                self.size += 1
                return None
            else:
                self._insert(root.rchild, data)

    def insert(self, data):
        #判断该树是否为空
        if self.root == None:
            new_node = Node(data)
            self.root = new_node
            self.size += 1
        else:
            self._insert(self.root, data)
        return self.root

#查找二分查找树的最小值
def find_min(root):
    # if root.lchild != None:
    #     return find_min(root.lchild)
    # else:
    #     return root.data
    while root.lchild != None:
        root = root.lchild
    return root.data

#查找二分查找树的最大值
def find_max(root):
    if root.rchild != None:
        return find_max(root.rchild)
    else:
        return root.data

#计算一棵树的深度
def deep(root):
    if root == None:
        return 0
    ldeep = 1
    rdeep = 1
    max = 1

    if root.has_lchild() != None:
        ldeep += deep(root.lchild)
    if root.has_rchild() != None:
        rdeep += deep(root.rchild)

    if ldeep > rdeep:
        max = ldeep
    else:
        max = rdeep
    return max

#计算第n层的节点数
def deep_width(root, n):
    if root == None:
        return 0
    if n == 1 or n == 0:
        return 1
    return deep_width(root.lchild, n-1) + deep_width(root.rchild, n-1)

#计算一棵树的宽度
def width (root):
    #计算这棵树有多少层（深度）
    tdeep = deep(root)
    max = 1
    #遍历每一层 将每一层的节点数计算出来
    for x in range(1, tdeep+1):
        '''计算一颗二叉树的第x层的节点数呢？
        计算第x-1层的所有的节点的左子树+右子树
        计算一颗二叉树的第x-1层的节点数呢？
        计算第x-2层的所有的节点的左子树+右子树
        ...
        计算第1层的节点数：1
        '''
        num = deep_width(root, x)
        print(x, num)
        if num > max:
            max = num
    return max

#中序遍历
def print_tree(root):
    if root == None:
        return None
    #左 根 右
    print_tree(root.lchild)
    print(root.data)
    print_tree(root.rchild)

#不使用递归的方式 按照深度遍历
def traverse_by_deep(root):
    if root == None:
        return None
    data_list = []
    s = Stack()
    #将根节点入栈
    s.push(root)

    #出栈
    while s.is_empty() != True:
        #出栈
        node = s.pop()
        print(node.data)
        data_list.append(node.data)
        #yield node.data
        #判断是否有右子树
        if node.has_rchild() != None:
            s.push(node.rchild)
        if node.has_lchild() != None:
            s.push(node.lchild)

    return data_list

#不使用递归的方式 按照层次遍历
def traverse_by_width(root):
    if root == None:
        return None
    q = Queue()

    #将根节点入队
    q.enqueue(root)
    while q.is_empty() != True:
        #出队
        node = q.dequeue()
        print(node.data)

        if node.has_lchild() != None:
            q.enqueue(node.lchild)
        if node.has_rchild() != None:
            q.enqueue(node.rchild)

#求一棵树的叶子节点的个数
    cnt=0
    def sum(root):
        if root==None:
            return 0
        if root.has_lchild()==None and root.has_rchild()==None:
            global cnt
            cnt+=1
        sum(root.lchild)
        sum(root.rchild)

#求一颗树度为2的节点的个数： 度：子树的个数

if __name__ == '__main__':
    tree = BST()

    #data = [random.randint(1, 100) for x in range(10)]
    data = [26, 49, 22, 84, 99, 28, 82, 57, 91, 44]
    print(data)
    for x in data:
        tree.insert(x)

    #print_tree(tree.root)
    # print(find_min(tree.root))
    # print(find_max(tree.root))

    #print(deep(tree.root))
    #width(tree.root)
    #traverse_by_deep(tree.root)
    traverse_by_width(tree.root)