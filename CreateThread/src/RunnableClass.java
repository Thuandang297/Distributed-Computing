public class RunnableClass implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Runnable["+i+"]");
            try
            {
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName());
//                System.out.println( Thread.currentThread().getState());
//                System.out.println(Thread.currentThread().getPriority());
            }catch (Exception e){System.out.println(e);}
        }
    }
}
