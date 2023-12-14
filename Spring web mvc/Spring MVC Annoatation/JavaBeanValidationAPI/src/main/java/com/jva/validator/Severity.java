package com.jva.validator;

import jakarta.validation.Payload;

public class Severity {

    public static interface CRITICAL extends Payload{}

    public static interface WARN extends Payload{}

    public static interface MINOR extends Payload{}

}
