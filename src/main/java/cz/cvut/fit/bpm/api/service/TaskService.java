/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.service;

import java.util.List;
import java.util.Map;

import cz.cvut.fit.bpm.api.dto.BpmTaskDto;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public interface TaskService {

    /**
     * Method returns all available tasks for user.
     * <p/>
     * Only active tasks are returned.
     *
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
    List<BpmTaskDto> getAssignedTasksForUser(String userId);

    /**
     * Method returns all available tasks for user but not the tasks already assigned to the user.
     * <p/>
     * Only active tasks are returned.
     *
     *
     * @param userId user identification
     * @return list of tasks
     */
    List<BpmTaskDto> getAvailableTasksForUser(String userId);

    /**
     * Method returns all available tasks for given group.
     * <p/>
     * Only active tasks are returned.
     *
     *
     * @param groupId group identification
     * @return list of tasks
     */
    List<BpmTaskDto> getAvailableTasksForGroup(String groupId);

    /**
     * Method completes identified task.
     *
     * @param processId process instance identifier
     */
    void completeTask(String processId);

    /**
     * Method completes identified task and submits provided data.
     *
     * @param processId process instance identifier
     * @param data      data which should be submitted with the task
     */
    void completeTask(String processId, Map<String, Object> data);

    /**
     * Get task info.
     *
     * @param taskId task identifier
     * @return task information
     */
    BpmTaskDto getTaskById(String taskId);
}
