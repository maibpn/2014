// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rad.roo.document.domain.PostalAddress;

privileged aspect PostalAddress_Roo_Jpa_Entity {
    
    declare @type: PostalAddress: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long PostalAddress.id;
    
    @Version
    @Column(name = "version")
    private Integer PostalAddress.version;
    
    public Long PostalAddress.getId() {
        return this.id;
    }
    
    public void PostalAddress.setId(Long id) {
        this.id = id;
    }
    
    public Integer PostalAddress.getVersion() {
        return this.version;
    }
    
    public void PostalAddress.setVersion(Integer version) {
        this.version = version;
    }
    
}
