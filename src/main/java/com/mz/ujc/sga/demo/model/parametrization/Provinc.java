
package com.mz.ujc.sga.demo.model.parametrization;

import com.mz.ujc.sga.demo.model.AbstractEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@SuppressWarnings("serial")
@Entity
@Table(name="provinc")
public class Provinc extends AbstractEntity<Integer>{
    
    @Column(name="name")
    private String name;
}
