from MyStack import Stack

#如果op1的优先级比op2高返回True， 否则返回False
#op1：遍历到的符号
#op2：操作符栈的栈顶元素
def operator_cmp(op1, op2):
    op1_list = ["*", "/"]
    op2_list = ["+", "-"]

    #如果op1 为 * / 并且 op2 为 + -
    if op1 in op1_list and op2 in op2_list:
        return True
    # 如果op1 为 * / 并且 op2 为 * /
    if op1 in op1_list and op2 in op1_list:
        return False

    #如果op1为 + -
    if op1 in op2_list:
        return False

def calculate(num1, num2, op):
    if op == "+":
        return num1+num2
    elif op == "-":
        return num1-num2
    elif op == "*":
        return num1*num2
    else:
        return num1/num2

if __name__ == '__main__':
    #操作数栈
    operand = Stack()

    #操作符栈
    operator = Stack()

    #在键盘上输入一个表达式
    res = input("请输入一个表达式 >>> ")

    #遍历表达式的每一个元素
    for x in res:
        #如果是数字存储到 操作数栈
        if x.isdigit() == True:
            operand.push(int(x))
        else:
        #如果是符号则判断当前符号和操作符栈顶的元素的优先级关系

            #从操作符栈出栈一个操作符
            if operator.is_empty(): #如果操作符栈为空
                operator.push(x)
            else:
                op = operator.pop()

                #比较操作符的优先级关系
                ret = operator_cmp(x, op)
                # 如果优先级比栈顶符号的优先级高则 直接入栈
                if ret == True:
                    operator.push(op)
                    operator.push(x)
                #如果优先级比栈顶符号的优先级低 或者 两者优先级相同， 则先出栈栈顶符号，并且在操作数栈中出两个操作数，将计算的
                #结果入 操作数栈，在将当前操作符入 操作符栈
                else:
                    #出栈两个操作数
                    num1 = operand.pop()
                    num2 = operand.pop()

                    result = calculate(num2, num1, op)

                    #结果入操作数栈
                    operand.push(result)
                    #遍历到的操作符入操作符栈
                    operator.push(x)

    #遍历操作符栈，每次取出一个操作符，同时在操作数栈中取出两个元素 计算完以后将结果保存到操作数栈
    while operator.is_empty() == False:
        op = operator.pop()
        # 出栈两个操作数
        num1 = operand.pop()
        num2 = operand.pop()

        result = calculate(num2, num1, op)
        # 结果入操作数栈
        operand.push(result)
    #最后再弹出操作数栈的元素就是最终的计算结果
    print(operand.pop())
