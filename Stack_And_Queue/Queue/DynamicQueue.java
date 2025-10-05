package Stack_And_Queue.Queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFull()){
            // double the size of array

            int []temp= new int[data.length*2];

            // copy all the previous items in my data

            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[(front+i)%data.length]; // important
            }
            front =0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }
}
