package br.com.fiap.javaadv.tds2pj.order_api.domainmodel.entity;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseOrder {
    private @Setter Long id;
    private @Setter String customerName;
    private @Setter OrderStatus status;
    private @Setter OffsetDateTime createdAt;
    private @Setter List<OrderItem> items = new ArrayList<>();
}
