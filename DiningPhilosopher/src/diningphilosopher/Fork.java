
package diningphilosopher;
import java.util.concurrent.Semaphore;

public class Fork 
{
    public  Semaphore fork = new Semaphore(1);
    public int id;

    Fork(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean take()
    {
        return fork.tryAcquire();
    }

    public void putDown() 
    {
        fork.release();
    }
}