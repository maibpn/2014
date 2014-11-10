package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.Email;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ElectronicAddress {

    /**
     */
	 @Email
    private String email;

    /**
     */
    private String web;

}
