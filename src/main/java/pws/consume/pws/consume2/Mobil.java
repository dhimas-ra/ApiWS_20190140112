/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.consume.pws.consume2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dhimas
 */
@Entity
@Table(name = "mobil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mobil.findAll", query = "SELECT m FROM Mobil m"),
    @NamedQuery(name = "Mobil.findById", query = "SELECT m FROM Mobil m WHERE m.id = :id"),
    @NamedQuery(name = "Mobil.findByNamaMobil", query = "SELECT m FROM Mobil m WHERE m.namaMobil = :namaMobil"),
    @NamedQuery(name = "Mobil.findByTipeMobil", query = "SELECT m FROM Mobil m WHERE m.tipeMobil = :tipeMobil"),
    @NamedQuery(name = "Mobil.findByPlatNomor", query = "SELECT m FROM Mobil m WHERE m.platNomor = :platNomor")})
public class Mobil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nama_mobil")
    private String namaMobil;
    @Column(name = "tipe_mobil")
    private String tipeMobil;
    @Column(name = "plat_nomor")
    private String platNomor;

    public Mobil() {
    }

    public Mobil(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public void setTipeMobil(String tipeMobil) {
        this.tipeMobil = tipeMobil;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil)) {
            return false;
        }
        Mobil other = (Mobil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pws.consume.pws.consume2.Mobil[ id=" + id + " ]";
    }
    
}
