package com.i3Verticals.CRD.DEMO.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Accounts {

    private String Id;

}
