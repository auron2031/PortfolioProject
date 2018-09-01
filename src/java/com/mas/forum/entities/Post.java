/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mas.forum.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex Fernandez
 */
@Entity
@Table(name = "Post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p")
    , @NamedQuery(name = "Post.findByPostid", query = "SELECT p FROM Post p WHERE p.postid = :postid")
    , @NamedQuery(name = "Post.findByTitle", query = "SELECT p FROM Post p WHERE p.title = :title")
    , @NamedQuery(name = "Post.findByMessage", query = "SELECT p FROM Post p WHERE p.message = :message")
    , @NamedQuery(name = "Post.findByCreatedtime", query = "SELECT p FROM Post p WHERE p.createdtime = :createdtime")
    , @NamedQuery(name = "Post.findByParentpost", query = "SELECT p FROM Post p WHERE p.parentpost = :parentpost")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "postid")
    private Integer postid;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Column(name = "message")
    private String message;
    @Basic(optional = false)
    @Column(name = "createdtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "parentpost")
    private Short parentpost;
    @JoinColumn(name = "postuser", referencedColumnName = "userid")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User postuser;

    public Post() {
    }

    public Post(Integer postid) {
        this.postid = postid;
    }

    public Post(Integer postid, String title, Date createdtime) {
        this.postid = postid;
        this.title = title;
        this.createdtime = createdtime;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Short getParentpost() {
        return parentpost;
    }

    public void setParentpost(Short parentpost) {
        this.parentpost = parentpost;
    }

    public User getPostuser() {
        return postuser;
    }

    public void setPostuser(User postuser) {
        this.postuser = postuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postid != null ? postid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.postid == null && other.postid != null) || (this.postid != null && !this.postid.equals(other.postid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mas.forum.entities.Post[ postid=" + postid + " ]";
    }
    
}
