// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rad.roo.document.domain.TownDetail;

privileged aspect TownDetail_Roo_Jpa_Entity {
    
    declare @type: TownDetail: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TownDetail.id;
    
    @Version
    @Column(name = "version")
    private Integer TownDetail.version;
    
    public Long TownDetail.getId() {
        return this.id;
    }
    
    public void TownDetail.setId(Long id) {
        this.id = id;
    }
    
    public Integer TownDetail.getVersion() {
        return this.version;
    }
    
    public void TownDetail.setVersion(Integer version) {
        this.version = version;
    }
    
}
