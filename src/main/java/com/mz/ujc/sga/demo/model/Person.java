
package com.mz.ujc.sga.demo.model;

import com.mz.ujc.sga.demo.model.enums.Gender;
import com.mz.ujc.sga.demo.model.enums.MaritalStatus;
import com.mz.ujc.sga.demo.model.parametrization.District;
import java.util.Date;
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


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("serial")
@Entity
@Table(name="person")
public class Person extends AbstractEntity<Long> {

    @Column(name = "primeiro_nome")
    private String name;
    @Column(name = "ultimo_nome")
    private String apelido;
    @Column(name = "data_nacimento")
    private Date birthDay;
    @Column(name = "nuit")
    private Conta conta;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "maritalStatus")
    private MaritalStatus maritalStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    private District district;
}
