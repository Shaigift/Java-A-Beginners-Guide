package TryThis11_1;
/*
   Try This 11-1

   Extend Thread.
*/
class MyThread extends Thread {

    // Construct a new thread.
    MyThread(String name) {
        super(name); // name thread
    }

    // Entry point of thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}
