
package com.portfolio.GC.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    public String nombreP;
    @NotBlank
    public String descripcionP;
    @NotBlank
    public String img;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
