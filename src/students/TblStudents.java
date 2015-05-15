/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package students;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Prof
 */
@Entity
@Table(name = "tbl_students", catalog = "students", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblStudents.findAll", query = "SELECT t FROM TblStudents t"),
    @NamedQuery(name = "TblStudents.findByStdId", query = "SELECT t FROM TblStudents t WHERE t.stdId = :stdId"),
    @NamedQuery(name = "TblStudents.findByStdfirstName", query = "SELECT t FROM TblStudents t WHERE t.stdfirstName = :stdfirstName"),
    @NamedQuery(name = "TblStudents.findByStdlastName", query = "SELECT t FROM TblStudents t WHERE t.stdlastName = :stdlastName"),
    @NamedQuery(name = "TblStudents.findByStdGender", query = "SELECT t FROM TblStudents t WHERE t.stdGender = :stdGender"),
    @NamedQuery(name = "TblStudents.findByStdacademicYear", query = "SELECT t FROM TblStudents t WHERE t.stdacademicYear = :stdacademicYear"),
    @NamedQuery(name = "TblStudents.findByStdLebanese", query = "SELECT t FROM TblStudents t WHERE t.stdLebanese = :stdLebanese"),
    @NamedQuery(name = "TblStudents.findByStdAge", query = "SELECT t FROM TblStudents t WHERE t.stdAge = :stdAge"),
    @NamedQuery(name = "TblStudents.findByStdEmail", query = "SELECT t FROM TblStudents t WHERE t.stdEmail = :stdEmail"),
    @NamedQuery(name = "TblStudents.findByStdAddress", query = "SELECT t FROM TblStudents t WHERE t.stdAddress = :stdAddress")})
public class TblStudents implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "std_id")
    private Integer stdId;
    @Basic(optional = false)
    @Column(name = "std_firstName")
    private String stdfirstName;
    @Basic(optional = false)
    @Column(name = "std_lastName")
    private String stdlastName;
    @Basic(optional = false)
    @Column(name = "std_gender")
    private String stdGender;
    @Column(name = "std_academicYear")
    private Integer stdacademicYear;
    @Column(name = "std_lebanese")
    private String stdLebanese;
    @Column(name = "std_age")
    private Integer stdAge;
    @Column(name = "std_email")
    private String stdEmail;
    @Column(name = "std_address")
    private String stdAddress;

    public TblStudents() {
    }

    public TblStudents(Integer stdId) {
        this.stdId = stdId;
    }

    public TblStudents(Integer stdId, String stdfirstName, String stdlastName, String stdGender) {
        this.stdId = stdId;
        this.stdfirstName = stdfirstName;
        this.stdlastName = stdlastName;
        this.stdGender = stdGender;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        Integer oldStdId = this.stdId;
        this.stdId = stdId;
        changeSupport.firePropertyChange("stdId", oldStdId, stdId);
    }

    public String getStdfirstName() {
        return stdfirstName;
    }

    public void setStdfirstName(String stdfirstName) {
        String oldStdfirstName = this.stdfirstName;
        this.stdfirstName = stdfirstName;
        changeSupport.firePropertyChange("stdfirstName", oldStdfirstName, stdfirstName);
    }

    public String getStdlastName() {
        return stdlastName;
    }

    public void setStdlastName(String stdlastName) {
        String oldStdlastName = this.stdlastName;
        this.stdlastName = stdlastName;
        changeSupport.firePropertyChange("stdlastName", oldStdlastName, stdlastName);
    }

    public String getStdGender() {
        return stdGender;
    }

    public void setStdGender(String stdGender) {
        String oldStdGender = this.stdGender;
        this.stdGender = stdGender;
        changeSupport.firePropertyChange("stdGender", oldStdGender, stdGender);
    }

    public Integer getStdacademicYear() {
        return stdacademicYear;
    }

    public void setStdacademicYear(Integer stdacademicYear) {
        Integer oldStdacademicYear = this.stdacademicYear;
        this.stdacademicYear = stdacademicYear;
        changeSupport.firePropertyChange("stdacademicYear", oldStdacademicYear, stdacademicYear);
    }

    public String getStdLebanese() {
        return stdLebanese;
    }

    public void setStdLebanese(String stdLebanese) {
        String oldStdLebanese = this.stdLebanese;
        this.stdLebanese = stdLebanese;
        changeSupport.firePropertyChange("stdLebanese", oldStdLebanese, stdLebanese);
    }

    public Integer getStdAge() {
        return stdAge;
    }

    public void setStdAge(Integer stdAge) {
        Integer oldStdAge = this.stdAge;
        this.stdAge = stdAge;
        changeSupport.firePropertyChange("stdAge", oldStdAge, stdAge);
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        String oldStdEmail = this.stdEmail;
        this.stdEmail = stdEmail;
        changeSupport.firePropertyChange("stdEmail", oldStdEmail, stdEmail);
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        String oldStdAddress = this.stdAddress;
        this.stdAddress = stdAddress;
        changeSupport.firePropertyChange("stdAddress", oldStdAddress, stdAddress);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stdId != null ? stdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblStudents)) {
            return false;
        }
        TblStudents other = (TblStudents) object;
        if ((this.stdId == null && other.stdId != null) || (this.stdId != null && !this.stdId.equals(other.stdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "students.TblStudents[ stdId=" + stdId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
