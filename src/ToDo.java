import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jack on 10/12/15.
 */
public class ToDo {
    static void printTodos(ArrayList<ToDoItem> todos) {
        int todoNum = 1;
        for (ToDoItem todo : todos) {
            String checkBox = "[ ]";
            if (todo.isDone) {
                checkBox = "[x]";
            }
            System.out.println(todoNum + ". " + checkBox + " " + todo.text);
            todoNum++;
        }
    }
    public static void main(String[] args) {
        ArrayList<ToDoItem> todos = new ArrayList();
        Scanner scanner = new Scanner(System.in);1

        while (true) {
            printTodos(todos);

            System.out.println("Options:");
            System.out.println("[1] Create todo");
            System.out.println("[2] Mark todo as done or not done");

            String option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum == 1) {
                System.out.println("Type a todo and hit enter");
                String todo = scanner.nextLine();
                ToDoItem item = new ToDoItem(todo);
                todos.add(item);
            } else if (optionNum == 2) {
                System.out.println("Type the number of the todo you want to toggle");
                String select = scanner.nextLine();
                try {
                    int selectNum = Integer.valueOf(select);
                    ToDoItem item = todos.get(selectNum - 1);  // minus 1 bc arrays are zero based and we want to access the location in the array
                    item.isDone = !item.isDone;  // This allows you to flip the switch, basically, to toggle on/off
                } catch (Exception e) {
                    System.out.println("An error occurred!");
                }
            }
            else {
                System.out.println("Invalid number.");
            }
        }
    }
}
