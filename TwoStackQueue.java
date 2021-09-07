public class TwoStackQueue<T> implements TwoStackQueueInterface<T>{
    
    private MyStack<T> s1;
    private MyStack<T> s2;
    
    public TwoStackQueue(){
        
        s1 = new MyStack<>();
        s2 = new MyStack<>();
        
    }
    
    public void enqueue(T x){
        
        s1.push(x);
        
    }
    
    public T dequeue(){
        
        if(s2.isEmpty()){
            
            while(s1.isEmpty() == false){
                
                s2.push(s1.pop());
                
            }
            
        }
        
        return s2.pop();
        
    }
    
    public int size(){
        
        return s1.size() + s2.size();
        
    }
    
    public boolean isEmpty(){
        
        return s1.isEmpty() && s2.isEmpty();
        
    }
    
}