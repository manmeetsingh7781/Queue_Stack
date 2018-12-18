public class Queue {
    private int size, total, front, rear;
    private int [] queue;
/*
Front = Added last and First Object in the list;
Rear = Added first and Last in the list;
Size = Maximum Limit of Stack;
total = Number of Elements in the Stack
*/
    // Constructor
    private Queue(){
        size  = 50;
        total = 0;
        front = 0;
        rear  = 0;
        queue = new int[size];

    }

    // Constructor with Custom Size limit
    private Queue(int limit){
        this.size  = limit;
        total = 0;
        front = 0;
        rear  = 0;
        queue = new int[this.size];

    }


    // What value to push into the array of queue
    private void enqueue(int num)
      {
        if(!isFull()){
            total++;
            queue[rear] = num;
            System.out.println(queue[rear]);
            rear = ( rear + 1 ) % size;
            
        }else System.out.println("Stack is full");
    }


    // Removing an Element from the queue
    private int dequeue()
    {
       int item = queue[front];
       total--;
       front = ( front + 1 ) % size;
       return item;
    }

    // Checks if the queue is full or not
    private boolean isFull(){
        return (total == size);
    }

    // View All the elements
    private void showAll(){
       for(int each: queue){
           System.out.println(each);
       }
    }

    public static void main(String[] args) {
        Queue mylist= new Queue(10);
        mylist.enqueue(1);
        mylist.enqueue(2);
        mylist.enqueue(3);
        mylist.enqueue(4);
        mylist.enqueue(5);
        System.out.println("+=======View All=============+");
        mylist.showAll();

    }
}
