// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rad.roo.document.domain.Summary;

privileged aspect Summary_Roo_Jpa_Entity {
    
    declare @type: Summary: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Summary.id;
    
    @Version
    @Column(name = "version")
    private Integer Summary.version;
    
    public Long Summary.getId() {
        return this.id;
    }
    
    public void Summary.setId(Long id) {
        this.id = id;
    }
    
    public Integer Summary.getVersion() {
        return this.version;
    }
    
    public void Summary.setVersion(Integer version) {
        this.version = version;
    }
    
}