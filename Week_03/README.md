# 学习笔记

## 递归

### 定义

递归在计算机科学中是指函数自己调用自己，通过自己调用自己进行循环遍历的一种方法。递归的时候会有一个调用的栈，当递归到中止的条件时，开始从调用栈里面弹出，直到清空这个栈。

递归在现实中的情况例如：当两面镜子相互之间平行时，镜中的图像是以无限递归的形式出现的。

### 作用

递归其实类似于循环，但是递归因为本身会有一个调用栈，可以方便的解决一些重复性的问题，例如二叉树的遍历，斐波那契数列等。
### 递归思路 

- 写递归的时候首先要考虑结束的条件，避免无限递归。
- 找到当前重复性的问题进行处理。
- 调用函数本身，让函数进行递归调用。
- 重置和清理状态。

### 代码模板（java）

```java
public void recur(int level, int param) {
    // terminator 递归中止条件
    if (level > MAX_LEVEL) {
        // process result
        return;
    }

    // process currnt logic 处理当前重复问题
    process(level, param);

    // drill down 进入下一次递归调用
    recur(level+1, newParam);

    // restore current status 重置和清理状态
}
```

## 分治

### 定义

分治其实是一种特殊的递归，它把复杂的一个问题分解成两个或多个相同或相似的子问题，直到子问题可以简单的求解，原问题的解即子问题的解的合并。

### 作用

分治其实是很多高效算法的基础，例如排序算法中的归并排序和快速排序。

### 分治思路

分治其实只是比递归多了几个步骤，例如在处理当前层问题的时候进行子问题的拆分，递归结束的时候对结果进行合并。

### 代码模板（python）

```python
def divide_conquer(problem, param1, param2, ...):
  # recursion terminator
  if problem is None:
    print_result
return
  # prepare data
  data = prepare_data(problem)
  subproblems = split_problem(problem, data)
  # conquer subproblems
  subresult1 = self.divide_conquer(subproblems[0], p1, ...)
  subresult2 = self.divide_conquer(subproblems[1], p1, ...)
  subresult3 = self.divide_conquer(subproblems[2], p1, ...)
  ...
  # process and generate the final result
  result = process_result(subresult1, subresult2, subresult3, ...)
  # revert the current level states
```

## 回溯

回溯其实也是一种特殊的递归方式，它的实现和最简单的递归一样，但是它的思想是试错，类似于不停的去尝试问题的解决方法，直到尝试完所有可能的方法为止。
