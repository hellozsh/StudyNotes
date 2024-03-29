package 结构体实现.链表.队列;


import 结构体实现.链表.双向链表;

/*
  使用双向链表最好，因为都是相对于头尾操作，所以复杂度是1
 */
public class 队列<E> {


    private 双向链表<E> list = new 双向链表<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enQueue(E element) {
        list.add(element);
    }

    public E deQueue() {

       return list.remove(0);
    }

    public E front() {

        return list.get(0);
    }

    public void clear() {

        list.clear();
    }
}
