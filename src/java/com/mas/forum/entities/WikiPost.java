/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mas.forum.entities;

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
 * @author Alex Fernandez
 */
@Entity
@Table(name = "WikiPost")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WikiPost.findAll", query = "SELECT w FROM WikiPost w")
    , @NamedQuery(name = "WikiPost.findByWikipostid", query = "SELECT w FROM WikiPost w WHERE w.wikipostid = :wikipostid")
    , @NamedQuery(name = "WikiPost.findByTitle", query = "SELECT w FROM WikiPost w WHERE w.title = :title")
    , @NamedQuery(name = "WikiPost.findByContent", query = "SELECT w FROM WikiPost w WHERE w.content = :content")
    , @NamedQuery(name = "WikiPost.findByCategory", query = "SELECT w FROM WikiPost w WHERE w.category = :category")})
public class WikiPost implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "wikipostid")
    private Integer wikipostid;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "content")
    private String content;
    @Column(name = "category")
    private String category;

    public WikiPost() {
    }

    public WikiPost(Integer wikipostid) {
        this.wikipostid = wikipostid;
    }

    public WikiPost(Integer wikipostid, String title, String content) {
        this.wikipostid = wikipostid;
        this.title = title;
        this.content = content;
    }

    public Integer getWikipostid() {
        return wikipostid;
    }

    public void setWikipostid(Integer wikipostid) {
        this.wikipostid = wikipostid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wikipostid != null ? wikipostid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WikiPost)) {
            return false;
        }
        WikiPost other = (WikiPost) object;
        if ((this.wikipostid == null && other.wikipostid != null) || (this.wikipostid != null && !this.wikipostid.equals(other.wikipostid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mas.forum.entities.WikiPost[ wikipostid=" + wikipostid + " ]";
    }
    
}
