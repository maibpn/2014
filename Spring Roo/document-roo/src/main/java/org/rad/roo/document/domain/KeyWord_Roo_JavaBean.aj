// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import org.rad.roo.document.domain.KeyWord;
import org.rad.roo.document.domain.Speech;

privileged aspect KeyWord_Roo_JavaBean {
    
    public Speech KeyWord.getSpeech() {
        return this.speech;
    }
    
    public void KeyWord.setSpeech(Speech speech) {
        this.speech = speech;
    }
    
    public String KeyWord.getText() {
        return this.text;
    }
    
    public void KeyWord.setText(String text) {
        this.text = text;
    }
    
}