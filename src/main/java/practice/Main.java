package practice;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        todoList.dela.add("one");

        System.out.println(todoList.dela.size() + " - " + todoList.getTodos());
    }
}
