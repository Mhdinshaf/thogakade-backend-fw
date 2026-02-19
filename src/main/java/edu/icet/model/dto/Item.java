package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
        private String itemCode;
        private String description;
        private double unitPrice;
        private int qtyOnHand;
        private String packSize;
}
