package com.se.sample.service;

import java.math.BigInteger;

public abstract class AbstractSecuredTypeService<DTO> {

    public abstract Class<DTO> getDtoClass();

    public abstract DTO find(BigInteger id);
}
