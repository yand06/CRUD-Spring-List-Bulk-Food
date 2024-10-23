package iyanprogrammer.CRUD_spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorController {
    @ExceptionHandler(Exception.class)
    public String handleError(Exception e) {
        // Log the exception and return a custom error page
        return "error"; // Ganti dengan nama halaman error yang Anda buat
    }
}
