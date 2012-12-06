/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.service;

import cz.cvut.fit.bpm.api.dto.BpmTaskDto;

import java.util.List;
import java.util.Map;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public interface TaskService {

    /**
     * Method returns all available tasks for user.
     * <p/>
     * Only active tasks are returned.
     *
     * @param userId user identification
     * @return list of tasks
     */
    List<BpmTaskDto> getAllTasksForUser(String userId);

    /**
     * Method returns all tasks assigned to user.
     * <p/>
     * Only active tasks are returned.
     *
     * @param userId user identification
     * @return list of tasks
     */
    List<BpmTaskDto> getStartedTasksForUser(String userId);

    /**
     * Method returns all available tasks for user but not the tasks already assigned to the user.
     * <p/>
     * Only active tasks are returned.
     *
     * @param userId user identification
     * @return list of tasks
     */
    List<BpmTaskDto> getAvailableTasksForUser(String userId);

    /**
     * Method starts the process identified by process identifier string.
     *
     * @param processId process identifier
     * @return id of the started task
     */
    String startTask(String processId);

    /**
     * Method completes identified task.
     *
     * @param taskId task identifier
     */
    void completeTask(String taskId);

    /**
     * Method completes identified task and submits provided data.
     *
     * @param taskId task identifier
     * @param data   data which should be submitted with the task
     */
    void completeTask(String taskId, Map<String, Object> data);

    /**
     * Get task info.
     *
     * @param taskId task identifier
     * @return task information
     */
    BpmTaskDto getTaskById(String taskId);
}
