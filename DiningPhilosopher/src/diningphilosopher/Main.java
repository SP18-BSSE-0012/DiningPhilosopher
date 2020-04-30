
package diningphilosopher;


public class Main 
{
    public static void main(String[] args)
    {
        String[] names = {"Plato", "Aristotle", "Cicero", "Confucius", "Eratosthenes"};
        Fork[] fork = new Fork[5];
    DiningPhilosopher[] philosopher = new DiningPhilosopher[5];

    for (int i = 0; i < fork.length; i++) {
        fork[i] = new Fork(i);
    }

    for (int i = 0; i < philosopher.length; i++) 
    {


            philosopher[i] = new DiningPhilosopher(names[i], fork[(i+1)%5], fork[i]);
            philosopher[i].run();

    }

    
    }
}
