package seedu.address.logic.parser.commands.inventory;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.inventory.InventoryDeleteCommand;
import seedu.address.logic.parser.ParserUtil;
import seedu.address.logic.parser.commands.Parser;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new DeleteCommand object
 */
public class InventoryDeleteCommandParser implements Parser<InventoryDeleteCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DeleteCommand
     * and returns a DeleteCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public InventoryDeleteCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new InventoryDeleteCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, InventoryDeleteCommand.MESSAGE_USAGE), pe);
        }
    }

}
