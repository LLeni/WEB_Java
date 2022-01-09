/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LLeni
 */
@Entity
@Table(name = "reaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reaction.findAll", query = "SELECT r FROM Reaction r")
    , @NamedQuery(name = "Reaction.findByIdReaction", query = "SELECT r FROM Reaction r WHERE r.idReaction = :idReaction")
    , @NamedQuery(name = "Reaction.findByIsLikeReaction", query = "SELECT r FROM Reaction r WHERE r.isLikeReaction = :isLikeReaction")})
public class Reaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reaction")
    private Integer idReaction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_like_reaction")
    private boolean isLikeReaction;
    @JoinColumn(name = "id_profile", referencedColumnName = "id_profile")
    @ManyToOne
    private Profile idProfile;
    @JoinColumn(name = "id_record", referencedColumnName = "id_record")
    @ManyToOne
    private Record idRecord;

    public Reaction() {
    }

    public Reaction(Integer idReaction) {
        this.idReaction = idReaction;
    }

    public Reaction(Integer idReaction, boolean isLikeReaction) {
        this.idReaction = idReaction;
        this.isLikeReaction = isLikeReaction;
    }

    public Integer getIdReaction() {
        return idReaction;
    }

    public void setIdReaction(Integer idReaction) {
        this.idReaction = idReaction;
    }

    public boolean getIsLikeReaction() {
        return isLikeReaction;
    }

    public void setIsLikeReaction(boolean isLikeReaction) {
        this.isLikeReaction = isLikeReaction;
    }

    public Profile getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Profile idProfile) {
        this.idProfile = idProfile;
    }

    public Record getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Record idRecord) {
        this.idRecord = idRecord;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReaction != null ? idReaction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reaction)) {
            return false;
        }
        Reaction other = (Reaction) object;
        if ((this.idReaction == null && other.idReaction != null) || (this.idReaction != null && !this.idReaction.equals(other.idReaction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Reaction[ idReaction=" + idReaction + " ]";
    }
    
}
