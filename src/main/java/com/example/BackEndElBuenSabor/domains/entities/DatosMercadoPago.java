package com.example.BackEndElBuenSabor.domains.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "datos_mercado_pago")
public class DatosMercadoPago extends BaseEntidad{

    private Date dateCreated;

    private Date dateApproved;

    private Date dateLastUpdated;

    private int paymentTypeId;

    private int paymentMethodId;

    private String status;

    private String statusDetail;
}
