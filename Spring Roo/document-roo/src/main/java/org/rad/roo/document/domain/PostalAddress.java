package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PostalAddress {

    /**
     */
    private String postalCode;

    /**
     */
    @NotNull
    @OneToOne
    private TownDetail townDetail;

    /**
     */
    @NotNull
    @OneToOne
    private StreetDetail streetDetail;
}
