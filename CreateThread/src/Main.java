public class Main {
    public static   void main(String [] args)
    {
        //Declare one Thread by extend Threads
        ThreadClass threadClass=new ThreadClass();
        //Declare Thread by implement Runnable
        RunnableClass runnableClass=new RunnableClass();
        //Create Thread by Runnable
        Thread threadRunnable=new Thread(runnableClass);

        //start Thread
        threadClass.start();
        try {
            threadClass.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadRunnable.start();
    }
}
