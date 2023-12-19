

@ControllerAdvice
public class EmployeeExceptionHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(EmployeeException.class)
    ResponseEntity<ErrorResponse> employeeException(EmployeeException ex){
        List<String> details=new ArrayList<>();
        details.add(ex.getErrorCode());
        details.add(ex.getMessage());
        ErrorResponse res = new ErrorResponse(ex.getMessage(),ex.getErrorCode(),details);
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}