package br.com.lissandrocunha.food.ordering.system.order.service.domain.valueobject;

import br.com.lissandrocunha.food.ordering.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long value) {
        super(value);
    }
}
