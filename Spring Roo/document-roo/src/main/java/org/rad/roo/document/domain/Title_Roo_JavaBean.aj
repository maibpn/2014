// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import org.rad.roo.document.domain.Speech;
import org.rad.roo.document.domain.Title;

privileged aspect Title_Roo_JavaBean {
    
    public Speech Title.getSpeech() {
        return this.speech;
    }
    
    public void Title.setSpeech(Speech speech) {
        this.speech = speech;
    }
    
    public String Title.getText() {
        return this.text;
    }
    
    public void Title.setText(String text) {
        this.text = text;
    }
    
}