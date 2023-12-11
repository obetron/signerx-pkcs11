package com.gelecex.signerx;

public class SignerxPkcs11Exception extends RuntimeException {
    public SignerxPkcs11Exception(String message) {
        super(message);
    }

    public SignerxPkcs11Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
