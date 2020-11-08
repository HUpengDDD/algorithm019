学习笔记  
数组：  
查询的时间复杂度是O(1)  
删除和增加的时间复杂度是O(n)  

链表：  
链表LinkList的增删的时间复杂度 O(1)  
查询头结点和尾结点的时间复杂度为O(1)  
查询中间节点的时间复杂度为O(n)  

跳表：  
链表升维提速，增加空间换取时间。  
跳表是一种特殊的链表形态，跳表必须是一个有序的链表。  
在一维的链表上增加一级缓存，使用升维的方法来加速查询的效率，跳表中搜索的时间复杂度为O(logN)  
由于需要维护索引的准确性，所以每次增加和删除时候都需要更新索引，从而时间在复杂度变为O(logN)  
跳表的出现用来逐渐取代平衡树二分查找。  
Redis和LeveDB等中都使用了跳表。  

栈  
先入后出  
删除增加为 O(1)  
查询为 O(n)  

队列  
先入先出  
删除增加为 O(1)  
查询为 O(n)  

双端队列  
头部和尾端都可以进行添加和删除 复杂度为O(1)  
查询为 O(n)  

优先队列  
时间复杂度 插入O(1) 取出O(logN)  
底层具体时间的数据结构多样复杂，如Heap，bst,treap。  

/*------------------------Queue 和 Priority Queue 分析------------------------*/  
Queue  
Queue interface 继承了 Collection 接口，额外提供了插入，获取和检查方法。每个方法有两种形式：一种是操作失败会抛出异常，另一种是返回一个特殊值 null 或 false。  
抛出异常               
 插入   > add(e)         
 删除	  >remove(e)	        
 检查	  >element()	    
返回特殊值  
插入   >ffer(e)    
删除	 >poll(e)    
检查	 >peek()  

PriorityQueue
PriorityQueue 继承了 AbstractQueue 并实现了 java.io.Serializable，AbstractQueue 实现了 Queue。PriorityQueue 中的队列是通过平衡二叉树堆实现。  
插入：  
PriorityQueue 提供 add() 和 offer() 方法，实际 add() 还是会调用 offer() 方法。  
删除：  
PriorityQueue 提供 clear() 、 remove() 和 poll() 方法。  
remove() 方法会遍历队列找到和传入元素相同的值并删除这个值返回 true 和 false。   
clear() 清空队列，遍历整个队列，设置每一个位置都为 null，重置 size 为 0。  
poll() 取出队列数组下标 0 的元素，如果当前队列的 size 还不是 0，调用 siftDown() 方法确保通过 Comparable 获取最小的值在队列顶部，确保下次取出的也是最小的元素。  
查看：  
PriorityQueue 提供 peek() 方法查看队列顶部的数据。  

