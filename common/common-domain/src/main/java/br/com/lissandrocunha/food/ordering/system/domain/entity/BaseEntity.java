package br.com.lissandrocunha.food.ordering.system.domain.entity;

import java.util.Objects;

public abstract class BaseEntity<ID> {
    private ID idTYPE;

    public ID getId() {
        return idTYPE;
    }

    public void setId(ID idTYPE) {
        this.idTYPE = idTYPE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return idTYPE.equals(that.idTYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTYPE);
    }
}
