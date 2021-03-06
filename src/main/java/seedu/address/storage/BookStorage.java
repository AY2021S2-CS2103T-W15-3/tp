package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.Book;
import seedu.address.model.person.ReadOnlyPersonBook;

public interface BookStorage<T extends Book> {

    /**
     * Returns the file path of the data file.
     */
    Path getBookFilePath();

    /**
     * Returns AddressBook data as a {@link ReadOnlyPersonBook}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<T> readBook() throws DataConversionException, IOException;

    /**
     * @see #getAddressBookFilePath()
     */
    Optional<T> readBook(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyPersonBook} to the storage.
     * @param book cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveBook(T book) throws IOException;

    /**
     * @see #saveBook(T)
     */
    void saveBook(T book, Path filePath) throws IOException;
}
