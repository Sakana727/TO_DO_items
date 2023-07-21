package sg.edu.rp.c346.id22020383.to_do_items;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    // Method to get day of the week as a string from the Calendar day value
    private String getDay(int day) {
        String[] daysOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return daysOfWeek[day];
    }

    // Override toString() to display ToDoItem information
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String dateStr = sdf.format(date.getTime());
        return title + " - " + getDay(date.get(Calendar.DAY_OF_WEEK)) + ", " + dateStr;
    }
}


