package mxvell.code.task_tracker.api.factories;


import mxvell.code.task_tracker.api.dto.ProjectDto;
import mxvell.code.task_tracker.api.dto.TaskStateDto;
import mxvell.code.task_tracker.store.entities.ProjectEntity;
import mxvell.code.task_tracker.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity taskStateEntity) {
        return TaskStateDto.builder()
                .id(taskStateEntity.getId())
                .name(taskStateEntity.getName())
                .ordinal(taskStateEntity.getOrdinal())
                .createdAt(taskStateEntity.getCreatedAt())
                .build();
    }
}
