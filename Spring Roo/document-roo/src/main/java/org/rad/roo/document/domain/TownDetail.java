package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class TownDetail {

    /**
     */
    @NotNull
    private String code;

    /**
     */
    @Enumerated
    private Country country;

    /**
     */
    private String sec;

    /**
     */
    private String stateOrProvince;
}
