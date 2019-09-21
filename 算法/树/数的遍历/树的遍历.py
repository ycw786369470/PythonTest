import stack
import queue

#二叉树的节点
class TreeNode(object):
    __slots__ = 'value', 'left', 'right','parent'
    def __init__(self, value, parent = None, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent

    def hasLeft(self):
        return self.left
    def hasRight(self):
        return self.right

#binary search/sort tree
#二分查找树/二叉排序树
#将比根节点小的作为左子树 大的作为右子树
class BST(object):
    def __init__(self):
        self.size = 0
        self.root = None

    def insert(self, value):
        if self.root:
            self._insert(self.root, value)
        else:
            self.root = TreeNode(value)

        return self.root

    def _insert(self, current, value):
        #如果比当前节点小则插入左节点
        if value < current.value:
            #如果有左节点则递归
            if current.hasLeft():
                self._insert(current.left, value)
            else:
                current.left = TreeNode(value, parent = current)
        else :
            #如果比当前节点大则插入右节点
            if current.hasRight():
                self._insert(current.right, value)
            else:
                current.right = TreeNode(value, parent=current)

    def Tprint(self, current):
        if current:
            self.Tprint(current.left)
            print(current.value)
            self.Tprint(current.right)

# 树的深度
def tree_deep(tree):
    if tree == None:
        return 0
    ldeep = 1
    rdeep = 1

    max = 1
    if tree.hasLeft():
        ldeep += tree_deep(tree.left)
    if tree.hasRight():
        rdeep += tree_deep(tree.right)

    if ldeep > rdeep:
        max = ldeep
    else:
        max = rdeep
    return max

#求第n层的宽度
def level_width(tree, n):
    #第n层的宽度 = n-1层的左子树数量 +  n-1层的右子树数量
    if tree == None:
        return 0
    else:
        if n == 1 and n == 0:
            return 1
        else :
            return level_width(tree.left, n-1) + level_width(tree.right, n-1)

#求一颗二叉数的宽度
def tree_width(tree):
    #求树的深度
    deep = tree_deep(tree)
    print("deep:", deep)
    max = 1
    width = 1
    for i in range(1, deep+1):
        width = level_width(tree, i)
        if width > max:
            max = width

    return max

#不使用递归遍历一棵树，深度优先 先序
def traverse_tree_deep(tree):
    #树是否为空
    if tree.root == None:
        return None

    #创建一个栈
    s = stack.Stack()

    #先将根节点入栈
    s.push(tree.root)

    while s.is_empty() == False:
        #从栈中出栈一个节点
        root = s.pop()
        print(root.value)

        #如果右子树不为空
        if root.hasRight():
            s.push(root.right)

        if root.hasLeft():
            s.push(root.left)

#不用递归 遍历二叉树 按层次遍历
def traverse_tree_width(tree):
    # 树是否为空
    if tree.root == None:
        return None

    q = queue.Queue()
    q.enqueue(tree.root)

    while q.is_empty() == False:
        root = q.dequeue()
        print(root.value)

        if root.hasLeft():
            q.enqueue(root.left)
        if root.hasRight():
            q.enqueue(root.right)

if __name__ == "__main__":
    bst = BST()
    bst.insert(10)
    bst.insert(16)
    bst.insert(5)
    bst.insert(3)
    bst.insert(4)
    bst.insert(2)
    bst.insert(20)
    bst.insert(13)
    bst.insert(1)
    bst.insert(8)
    bst.insert(9)
    bst.insert(15)
    bst.insert(19)
    bst.insert(30)

    # # bst.Tprint(bst.root)
    #
    # print(tree_deep(bst.root))
    # print(tree_width(bst.root))
    # get_num(bst.root)
    # print(cnt)

    traverse_tree_deep(bst)
    # traverse_tree_width(bst)