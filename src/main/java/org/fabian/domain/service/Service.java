package org.fabian.domain.service;

public interface Service<I,O> {
    O invoke(I i);
}
