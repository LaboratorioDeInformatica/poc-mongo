package com.labinf.poc.mongo.pocmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 6323304700162184452L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
