package todoList.implementation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 9/21/2018.
 */
public class TodoListImpl {
    private ArrayList<TodoListItemImpl> items;

    public TodoListImpl(){
        items=new ArrayList<TodoListItemImpl>();
    }

    public void addItem(TodoListItemImpl item){
        items.add(item);
    }

    public void addItem(String title){
        items.add(new TodoListItemImpl(title));

    }


    public int length(){
        int length=items.size();
        return length;
    }

    public void addItems(TodoListItemImpl[] todos){
        items.addAll(new ArrayList<>(Arrays.asList(todos)));

    }

    public void toggle(String title){


    }

    public void deleteItem(){

    }

    public void toggleAll(){

    }

    public void getItem(){

    }


}
