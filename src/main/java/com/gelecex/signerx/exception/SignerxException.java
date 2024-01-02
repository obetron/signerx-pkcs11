package com.gelecex.signerx.exception;

public class SignerxException extends Exception {
    public SignerxException(String message) {
        super(message);
    }

    public SignerxException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignerxException(Throwable cause) {
        super(cause);
    }

    protected SignerxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
