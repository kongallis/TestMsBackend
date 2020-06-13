/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermarketTeam.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macuser
 */
@Entity
@Table(name = "users", catalog="sql7347217", schema="")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByFirstname", query = "SELECT u FROM Users u WHERE u.firstname = :firstname")
    , @NamedQuery(name = "Users.findByLastname", query = "SELECT u FROM Users u WHERE u.lastname = :lastname")
    , @NamedQuery(name = "Users.findByRanking", query = "SELECT u FROM Users u WHERE u.ranking = :ranking")
    , @NamedQuery(name = "Users.findByJobstatus", query = "SELECT u FROM Users u WHERE u.jobstatus = :jobstatus")
    , @NamedQuery(name = "Users.findByLocation", query = "SELECT u FROM Users u WHERE u.location = :location")
    , @NamedQuery(name = "Users.findByLevel", query = "SELECT u FROM Users u WHERE u.level = :level")
    , @NamedQuery(name = "Users.findBySalary", query = "SELECT u FROM Users u WHERE u.salary = :salary")})
public class Users implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 45)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ranking")
    private int ranking;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "jobstatus")
    private String jobstatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "level")
    private String level;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salary")
    private int salary;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(Integer id, String firstname, String lastname, int ranking, String jobstatus, String location, String level, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ranking = ranking;
        this.jobstatus = jobstatus;
        this.location = location;
        this.level = level;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.supermarketTeam.entities.Users[ id=" + id + " ]";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
