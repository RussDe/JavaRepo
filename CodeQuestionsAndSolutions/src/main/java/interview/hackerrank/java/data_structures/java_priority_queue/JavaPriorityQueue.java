package interview.hackerrank.java.data_structures.java_priority_queue;

/**
 * https://www.hackerrank.com/challenges/java-priority-queue
 * In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

 In this problem we will test your knowledge on Java Priority Queue.

 You have to deal with  types of events: ENTER (a student enters the queue) or SERVED.

 A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

 The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 Any students having the same CGPA and name will be served in ascending token order.
 Given a sequence of  events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.

 Input Format

 The first line contains an integer, , denoting the total number of events. Each of the  subsequent lines will be of the following two forms:

 ENTER name CGPA token - The student to be inserted into the priority queue.
 SERVED - The highest priority student in the queue was served.
 Constraints

 Constraints


 where
 where each token i is a unique integer.
 Output Format

 Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.

 Sample Input

 12
 ENTER John 3.75 50
 ENTER Mark 3.8 24
 ENTER Shafaet 3.7 35
 SERVED
 SERVED
 ENTER Samiha 3.85 36
 SERVED
 ENTER Ashley 3.9 42
 ENTER Maria 3.6 46
 ENTER Anik 3.95 49
 ENTER Dan 3.95 50
 SERVED
 Sample Output

 Dan
 Ashley
 Shafaet
 Maria
 Explanation

 Let's call our queue .

 : We add John to the empty queue.

 : We add Mark to the queue; }

 : We add Shafaet to the queue;

 : Mark is served as he has the highest CGPA;

 : John is served next as he has the highest CGPA;

 : We add Samiha to the queue;

 : Samiha is served as she has the highest CGPA;

 through , the next four students are added giving us:

 : Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order;

 As all events are completed, we print names of each remaining students on a new line.
 * Created by rustem on 11/3/16.
 */
public class JavaPriorityQueue {

}
