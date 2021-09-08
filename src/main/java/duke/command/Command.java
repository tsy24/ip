package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;

/**
 * Abstract Command class that executes the command of the user.
 */
public abstract class Command {

    /**
     * Executes itself.
     *
     * @param taskList The TaskList of Duke.
     * @param storage The Storage of Duke.
     * @return Response string.
     * @throws DukeException  If error occur during execution.
     */
    public abstract String execute(TaskList taskList, Storage storage) throws DukeException;
}
