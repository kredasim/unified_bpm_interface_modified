/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.service;

import cz.cvut.fit.bpm.api.dto.BpmProcessDto;

import java.util.List;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public interface ProcessService {

    /**
     * Returns all available processes for specified user.
     *
     * @param userId user identifier
     * @return list of processes
     */
    List<BpmProcessDto> getAllProcessesForUser(String userId);
}
