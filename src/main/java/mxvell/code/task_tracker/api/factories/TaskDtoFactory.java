package mxvell.code.task_tracker.api.factories;

import mxvell.code.task_tracker.api.dto.TaskDto;
import mxvell.code.task_tracker.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {
    public TaskDto makeTaskDto(TaskEntity taskEntity) {
        return TaskDto.builder()
                .id(taskEntity.getId())
                .name(taskEntity.getName())
                .createdAt(taskEntity.getCreatedAt())
                .description(taskEntity.getDescription())
                .build();
    }
}

