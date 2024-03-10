package com.cydeo.homePractice.queue;

public interface CustomQueue<E> {

    /**
     * Inserts the specified element into this queue if it is possible
     * to do so immediately without violating capacity restrictions,
     * returning true upon success and throwing an IllegalStateException
     * if no space is currently available.
     */
    boolean add(E item);

    /**
     * Retrieves, but does not remove,
     * the head of this queue, or returns null if this queue is empty.
     */
    E peek();

    /**
     * Retrieves and removes the head of this queue,
     * or returns null if this queue is empty.
     */
    E poll();

}
