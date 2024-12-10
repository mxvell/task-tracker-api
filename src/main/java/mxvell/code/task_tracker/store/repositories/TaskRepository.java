package mxvell.code.task_tracker.store.repositories;

import mxvell.code.task_tracker.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
