package com.random.percentwork;

import java.util.ArrayList;

class Task {
    String description;
    int time;

    Task(String description, int time) {
        this.description = description;
        this.time = time;
    }
}

public class AutoToDoList {
    public static void main(String[] args) {

        String input = "I have to finish my schoolwork at 9am, chores at 6pm, make dinner at 7pm";
        String[] tasks = input.split(",");

        ArrayList<Task> taskList = new ArrayList<>();

        for (String task : tasks) {
            String[] parts = task.trim().split(" at ");
            if (parts.length == 2) {

                String description = parts[0].trim();
                String timeText = parts[1].trim();
                int hour = 0;

                if (parts[1].endsWith("am")) {
                   hour = Integer.parseInt(parts[1].replace("am", "").trim());
                     if (hour == 12) hour = 0;
                } else if (parts[1].endsWith("pm")) {
                    hour = Integer.parseInt(parts[1].replace("pm", "").trim());
                    if (hour != 12) hour += 12;
                }

                taskList.add(new Task(description, hour));
            }
        }

        taskList.sort((a, b) -> a.time - b.time);

        for (Task t : taskList) {
            int displayHour = t.time == 0 ? 12 : (t.time > 12 ? t.time - 12 : t.time);
            String period = t.time < 12 ? "am" : "pm";
            System.out.println(displayHour + ":00 " + period + " - " + t.description);
        }
    }
}
