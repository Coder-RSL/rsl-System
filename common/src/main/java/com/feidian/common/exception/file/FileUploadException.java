package com.feidian.common.exception.file;


import java.io.PrintStream;
import java.io.PrintWriter;

public class FileUploadException extends Exception {
    private static final long serialVersionUID = 8881893724388807504L;
    private final Throwable cause;

    public FileUploadException() {
        this((String)null, (Throwable)null);
    }

    public FileUploadException(String msg) {
        this(msg, (Throwable)null);
    }

    public FileUploadException(String msg, Throwable cause) {
        super(msg);
        this.cause = cause;
    }

    public void printStackTrace(PrintStream stream) {
        super.printStackTrace(stream);
        if (this.cause != null) {
            stream.println("Caused by:");
            this.cause.printStackTrace(stream);
        }

    }

    public void printStackTrace(PrintWriter writer) {
        super.printStackTrace(writer);
        if (this.cause != null) {
            writer.println("Caused by:");
            this.cause.printStackTrace(writer);
        }

    }

    public Throwable getCause() {
        return this.cause;
    }
}
