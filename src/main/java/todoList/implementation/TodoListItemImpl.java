package todoList.implementation;

import todoList.interfaces.Togglable;

/**
 * Created by User on 9/16/2018.
 */
public class TodoListItemImpl implements Togglable {

    private String title;
    private boolean toggled;


    public TodoListItemImpl(String title) {
        if (title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
        this.title = title;
        this.toggled = false;
    }

    public String getTitle() {
        return title;
    }

    public TodoListItemImpl setTitle(String title) {
        if (title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
        return new TodoListItemImpl(title);
    }

    public boolean isToggled() {

        return toggled;
    }

    public void setToggled(boolean toggled) {

        this.toggled = toggled;
    }

    @Override
    public void toggle() {
        toggled=!toggled;

    }




}

