package practice;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> dela = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        dela.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index > dela.size()) {
            dela.add(todo);
        } else {
            dela.add(index,todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index > 0 && index <= dela.size()) {
            dela.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index > 0 && index < (dela.size() - 1)) {
            dela.remove(index);
        } else {
            System.out.println("nothing");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>(dela);
    }

}