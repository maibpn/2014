// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import org.rad.roo.document.domain.Country;
import org.rad.roo.document.domain.TownDetail;

privileged aspect TownDetail_Roo_JavaBean {
    
    public String TownDetail.getCode() {
        return this.code;
    }
    
    public void TownDetail.setCode(String code) {
        this.code = code;
    }
    
    public Country TownDetail.getCountry() {
        return this.country;
    }
    
    public void TownDetail.setCountry(Country country) {
        this.country = country;
    }
    
    public String TownDetail.getSec() {
        return this.sec;
    }
    
    public void TownDetail.setSec(String sec) {
        this.sec = sec;
    }
    
    public String TownDetail.getStateOrProvince() {
        return this.stateOrProvince;
    }
    
    public void TownDetail.setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }
    
}