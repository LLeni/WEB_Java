/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LLeni
 */
@Entity
@Table(name = "profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profile.findAll", query = "SELECT p FROM Profile p")
    , @NamedQuery(name = "Profile.findByIdProfile", query = "SELECT p FROM Profile p WHERE p.idProfile = :idProfile")
    , @NamedQuery(name = "Profile.findByLoginProfile", query = "SELECT p FROM Profile p WHERE p.loginProfile = :loginProfile")
    , @NamedQuery(name = "Profile.findByEncryptPasswordProfile", query = "SELECT p FROM Profile p WHERE p.encryptPasswordProfile = :encryptPasswordProfile")
    , @NamedQuery(name = "Profile.findByDateRegistrationProfile", query = "SELECT p FROM Profile p WHERE p.dateRegistrationProfile = :dateRegistrationProfile")
    , @NamedQuery(name = "Profile.findByAboutProfile", query = "SELECT p FROM Profile p WHERE p.aboutProfile = :aboutProfile")})
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_profile")
    private Integer idProfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "login_profile")
    private String loginProfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "encrypt_password_profile")
    private String encryptPasswordProfile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_registration_profile")
    @Temporal(TemporalType.DATE)
    private Date dateRegistrationProfile;
    @Size(max = 255)
    @Column(name = "about_profile")
    private String aboutProfile;
    @OneToMany(mappedBy = "idProfile")
    private List<Reaction> reactionList;
    @OneToMany(mappedBy = "idProfile")
    private List<Record> recordList;
    @OneToMany(mappedBy = "idProfile")
    private List<Comment> commentList;

    public Profile() {
    }

    public Profile(Integer idProfile) {
        this.idProfile = idProfile;
    }

    public Profile(Integer idProfile, String loginProfile, String encryptPasswordProfile, Date dateRegistrationProfile) {
        this.idProfile = idProfile;
        this.loginProfile = loginProfile;
        this.encryptPasswordProfile = encryptPasswordProfile;
        this.dateRegistrationProfile = dateRegistrationProfile;
    }

    public Integer getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Integer idProfile) {
        this.idProfile = idProfile;
    }

    public String getLoginProfile() {
        return loginProfile;
    }

    public void setLoginProfile(String loginProfile) {
        this.loginProfile = loginProfile;
    }

    public String getEncryptPasswordProfile() {
        return encryptPasswordProfile;
    }

    public void setEncryptPasswordProfile(String encryptPasswordProfile) {
        this.encryptPasswordProfile = encryptPasswordProfile;
    }

    public Date getDateRegistrationProfile() {
        return dateRegistrationProfile;
    }

    public void setDateRegistrationProfile(Date dateRegistrationProfile) {
        this.dateRegistrationProfile = dateRegistrationProfile;
    }

    public String getAboutProfile() {
        return aboutProfile;
    }

    public void setAboutProfile(String aboutProfile) {
        this.aboutProfile = aboutProfile;
    }

    @XmlTransient
    public List<Reaction> getReactionList() {
        return reactionList;
    }

    public void setReactionList(List<Reaction> reactionList) {
        this.reactionList = reactionList;
    }

    @XmlTransient
    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfile != null ? idProfile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profile)) {
            return false;
        }
        Profile other = (Profile) object;
        if ((this.idProfile == null && other.idProfile != null) || (this.idProfile != null && !this.idProfile.equals(other.idProfile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Profile[ idProfile=" + idProfile + " ]";
    }
    
}
