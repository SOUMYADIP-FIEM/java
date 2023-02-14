import java.util.*; 
class queueOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of the stack"); 
        int n =sc.nextInt();
        Queue q= new Queue(n);
        do
        {
            System.out.println("\nOperations on stack");
            System.out.println("1.Insert value in Queue");
            System.out.println("2.Delete value from Queue");
            System.out.println("3.Display values of Queue");
            System.out.println("4.Exit"); 
            System.out.println("Enter the your choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                System.out.println("Enter the value");
                int i=sc.nextInt();
                q.insert(i);
                q.show();
                break; 
                case 2:
                int d = q.delete();
                System.out.println("The deleted value is " +d);
                q.show();
                break;
                case 3:
                q.show(); 
                break;
                case 4:
                System.exit(0);
                default: 
                System.out.println("Wrong choice");
            }
        }
        while(true);
    }
}
class Queue
{
    int Q[];
    int size, rear, front;
    Queue(int n)
    {
        size=n;
        Q=new int[size];
        rear=front=-1;
    }
    void insert(int v)
    {
        if(rear == size-1)
        {
            System.out.println("\nQueue Overflow\n");
        }
        else if(front==-1)
        {
            front = 0; 
            Q[++rear] = v;
        } 
        else
        {
            Q[++rear] = v;
        }
    }
    int delete()
    {
        int del=0;
        if(front==-1 && rear ==-1)
        { 
            System.out.println("\nQueue Underflow\n");
        }
        else if(front == rear)
        {
            del = Q[front]; 
            front = -1;
            rear = -1;
        }
        else
        {
            del= Q[front]; 
            front++;
        } 
        return(del);
    }
    void show()
    {
        System.out.println("\nQueue Values:-"); 
        if(front!=-1)
        {
            for(int i=rear;i>=front; i--)
            {
            System.out.println(Q[1]);
            }
        }
    }
}









