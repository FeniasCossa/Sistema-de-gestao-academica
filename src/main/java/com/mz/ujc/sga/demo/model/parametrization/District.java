
package com.mz.ujc.sga.demo.model.parametrization;

import com.mz.ujc.sga.demo.model.AbstractEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Fenias Cossa
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "district")
public class District extends AbstractEntity<Integer>{
    
    @Column(name="name")
    private String name;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Provinc province;
    
}
