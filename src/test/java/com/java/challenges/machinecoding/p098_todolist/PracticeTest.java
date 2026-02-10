package com.java.challenges.machinecoding.p098_todolist;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testTodoList() {
        Practice todo = new Practice();
        int t1 = todo.addTask("Buy groceries");
        int t2 = todo.addTask("Read a book");
        assertThat(todo.listPendingTasks()).hasSize(2);
        todo.completeTask(t1);
        assertThat(todo.listPendingTasks()).hasSize(1);
        assertThat(todo.listPendingTasks().get(0)).isEqualTo("Read a book");
    }
}