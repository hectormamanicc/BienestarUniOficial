package org.mybatis.bu.domain;
// Generated 26/01/2016 12:18:34 PM by Hibernate Tools 4.3.1



/**
 * Internos generated by hbm2java
 */
public class Internos  implements java.io.Serializable {


     private String idInterno;
     private String nroPieza;
     private Character estado;
     private String idAlumno;

    public Internos() {
    }

	
    public Internos(String idInterno) {
        this.idInterno = idInterno;
    }
    public Internos(String idInterno, String nroPieza, Character estado, String idAlumno) {
       this.idInterno = idInterno;
       this.nroPieza = nroPieza;
       this.estado = estado;
       this.idAlumno = idAlumno;
    }
   
    public String getIdInterno() {
        return this.idInterno;
    }
    
    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }
    public String getNroPieza() {
        return this.nroPieza;
    }
    
    public void setNroPieza(String nroPieza) {
        this.nroPieza = nroPieza;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public String getIdAlumno() {
        return this.idAlumno;
    }
    
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }




}


