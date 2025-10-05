package Stack_And_Queue.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    // here rest all opf the things will be same as CustomStack(pop,peek) but there will be change in push


    @Override
    public boolean push(int item) { // It is imporatant to ovverride in the case of dynamicstack to take care of size.
        if(this.isFull()){
            // double the size of array

            int []temp= new int[data.length*2];

            // copy all the previous items in my data

            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
