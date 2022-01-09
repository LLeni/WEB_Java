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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LLeni
 */
@Entity
@Table(name = "comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c")
    , @NamedQuery(name = "Comment.findByIdComment", query = "SELECT c FROM Comment c WHERE c.idComment = :idComment")
    , @NamedQuery(name = "Comment.findByTextComment", query = "SELECT c FROM Comment c WHERE c.textComment = :textComment")})
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comment")
    private Integer idComment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "text_comment")
    private String textComment;
    @JoinColumn(name = "id_profile", referencedColumnName = "id_profile")
    @ManyToOne
    private Profile idProfile;
    @JoinColumn(name = "id_record", referencedColumnName = "id_record")
    @ManyToOne
    private Record idRecord;

    public Comment() {
    }

    public Comment(Integer idComment) {
        this.idComment = idComment;
    }

    public Comment(Integer idComment, String textComment) {
        this.idComment = idComment;
        this.textComment = textComment;
    }

    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
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
        hash += (idComment != null ? idComment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.idComment == null && other.idComment != null) || (this.idComment != null && !this.idComment.equals(other.idComment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Comment[ idComment=" + idComment + " ]";
    }
    
}
