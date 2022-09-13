package com.mintic.terra_software.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Movimientos")
public class MovimientoDinero {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double monto;
    private String concepto;

    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa idEmpresa;

    @ManyToOne
    @JoinColumn(name="id_empleado")
    private Empleado idEmpleado;


    public MovimientoDinero() {
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return Empresa return the idEmpresa
     */
    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return Empleado return the idEmpleado
     */
    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public MovimientoDinero(double monto, String concepto, Empresa idEmpresa, Empleado idEmpleado)
    {
        this.monto = monto;
        this.concepto = concepto;
        this.idEmpresa = idEmpresa;
        this.idEmpleado = idEmpleado;
    }

}
