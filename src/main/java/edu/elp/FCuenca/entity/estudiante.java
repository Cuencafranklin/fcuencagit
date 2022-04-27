package edu.elp.FCuenca.entity;

import javax.persistence.*;

    @Entity
    @Table(name ="estudiante")
    @PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
    public class estudiante {
        @Id
        @Column(name = "estudiante", nullable = false)
        private Long estudiante;

        @Column(name = "codigo", length = 10, nullable = false)
        private String Codigo;

        @Column(name = "serie", length = 8)
        private String Serie;

        public Long getEstudiante() {
            return estudiante;
        }

        public void setEstudiante(Long estudiante) {
            this.estudiante = estudiante;
        }

        public estudiante() {
        }

        public String getCodigo() {
            return Codigo;
        }

        public void setCodigo(String codigo) {
            this.Codigo = codigo;
        }

        public String getSerie() {
            return Serie;
        }

        public void setSerie(String serie) {
            this.Serie = serie;
        }
    }

