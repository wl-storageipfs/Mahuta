package net.consensys.mahuta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends MahutaException {

    private static final long serialVersionUID = -1577067446504139812L;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String messageFormat, Object... args) {
        super(String.format(messageFormat, args));
    }

}