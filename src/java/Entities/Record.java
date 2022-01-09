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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "record")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Record.findAll", query = "SELECT r FROM Record r")
    , @NamedQuery(name = "Record.findByIdRecord", query = "SELECT r FROM Record r WHERE r.idRecord = :idRecord")
    , @NamedQuery(name = "Record.findByDateRecord", query = "SELECT r FROM Record r WHERE r.dateRecord = :dateRecord")
    , @NamedQuery(name = "Record.findByLinkDemoRecord", query = "SELECT r FROM Record r WHERE r.linkDemoRecord = :linkDemoRecord")
    , @NamedQuery(name = "Record.findByCountViewsRecord", query = "SELECT r FROM Record r WHERE r.countViewsRecord = :countViewsRecord")
    , @NamedQuery(name = "Record.findByAdditionalInformationRecord", query = "SELECT r FROM Record r WHERE r.additionalInformationRecord = :additionalInformationRecord")
    , @NamedQuery(name = "Record.findByTimeRunRecord", query = "SELECT r FROM Record r WHERE r.timeRunRecord = :timeRunRecord")
    })
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_record")
    private Integer idRecord;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_record")
    @Temporal(TemporalType.DATE)
    private Date dateRecord;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "link_demo_record")
    private String linkDemoRecord;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count_views_record")
    private int countViewsRecord;
    @Size(max = 255)
    @Column(name = "additional_information_record")
    private String additionalInformationRecord;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_run_record")
    @Temporal(TemporalType.TIME)
    private Date timeRunRecord;
    @OneToMany(mappedBy = "idRecord")
    private List<Reaction> reactionList;
    @JoinColumn(name = "id_profile", referencedColumnName = "id_profile")
    @ManyToOne
    private Profile idProfile;
    @OneToMany(mappedBy = "idRecord")
    private List<Comment> commentList;

    public Record() {
    }

    public Record(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public Record(Integer idRecord, Date dateRecord, String linkDemoRecord, int countViewsRecord, Date timeRunRecord) {
        this.idRecord = idRecord;
        this.dateRecord = dateRecord;
        this.linkDemoRecord = linkDemoRecord;
        this.countViewsRecord = countViewsRecord;
        this.timeRunRecord = timeRunRecord;
    }

    public Integer getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public Date getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(Date dateRecord) {
        this.dateRecord = dateRecord;
    }

    public String getLinkDemoRecord() {
        return linkDemoRecord;
    }

    public void setLinkDemoRecord(String linkDemoRecord) {
        this.linkDemoRecord = linkDemoRecord;
    }

    public int getCountViewsRecord() {
        return countViewsRecord;
    }

    public void setCountViewsRecord(int countViewsRecord) {
        this.countViewsRecord = countViewsRecord;
    }

    public String getAdditionalInformationRecord() {
        return additionalInformationRecord;
    }

    public void setAdditionalInformationRecord(String additionalInformationRecord) {
        this.additionalInformationRecord = additionalInformationRecord;
    }

    public Date getTimeRunRecord() {
        return timeRunRecord;
    }

    public void setTimeRunRecord(Date timeRunRecord) {
        this.timeRunRecord = timeRunRecord;
    }

    @XmlTransient
    public List<Reaction> getReactionList() {
        return reactionList;
    }

    public void setReactionList(List<Reaction> reactionList) {
        this.reactionList = reactionList;
    }

    public Profile getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Profile idProfile) {
        this.idProfile = idProfile;
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
        hash += (idRecord != null ? idRecord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Record)) {
            return false;
        }
        Record other = (Record) object;
        if ((this.idRecord == null && other.idRecord != null) || (this.idRecord != null && !this.idRecord.equals(other.idRecord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Record[ idRecord=" + idRecord + " ]";
    }
    
}
