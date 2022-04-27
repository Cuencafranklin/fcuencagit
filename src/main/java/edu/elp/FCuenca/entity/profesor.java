package edu.elp.FCuenca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class profesor extends persona {
    @Column(name = "cod_profesor", length = 12)
    private String codProfesor;

    public profesor() {
    }
    public String getCodDocente() {
        return codProfesor;
    }
    public void setCodDocente(String codDocente) {
        this.codProfesor = codDocente;
    }

}
