
package diningphilosopher;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class DiningPhilosopher extends Thread{

   
    private Fork fork_left;
    private Fork fork_right;
    private String name;
    
    public DiningPhilosopher(String name,Fork left,Fork right)
    {
        this.fork_left = left;
        this.fork_right = right;
        this.name = name;
        
    }
    
    @Override
    public void run() 
    {

        try 
        {
            sleep(1000);
        } catch (InterruptedException ex)
        {
        }

            eat();
    }
    
    private void eat(){
    if(fork_left.take()){
        if(fork_right.take()){
            try {
                System.out.println(this.name + " is eating.");
                sleep(2000); // eating;
            } catch (InterruptedException ex) { }
            System.out.println(this.name + " has finished eating.");
            fork_left.putDown();
            fork_right.putDown();  

        }
        else{
            fork_left.putDown();
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
        
    }
    
}
