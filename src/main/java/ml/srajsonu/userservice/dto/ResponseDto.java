package ml.srajsonu.userservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseDto<T> {

    private T data;

    private HttpStatus status;

    public ResponseDto(HttpStatus status, Object data) {
        this.data = (T) data;
        this.status = status;
    }
}
