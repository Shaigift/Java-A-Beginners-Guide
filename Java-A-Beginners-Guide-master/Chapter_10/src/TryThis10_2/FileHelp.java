package TryThis10_2;
// Demonstrate the file-based Help system.
public class FileHelp {
    public static void main(String args[]) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " +
                "Enter 'stop' to end.");
        do {
            topic = hlpobj.getSelection();

            if(!hlpobj.helpOn(topic))
                System.out.println("Topic not found.\n");

        } while(topic.compareTo("stop") != 0);
    }
}
