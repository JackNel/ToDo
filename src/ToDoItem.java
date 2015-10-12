/**
 * Created by Jack on 10/12/15.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text) {  //The default constructor is a method like any other method.  Only difference is you are telling it to run automatically when the program is run.
        this.text = text;
        this.isDone = false;
    }
}
