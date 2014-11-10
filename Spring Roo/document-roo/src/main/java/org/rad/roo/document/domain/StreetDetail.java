package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class StreetDetail {

    /**
     */
    private String addressGeneral;

    /**
     */
    private String buildingName;

    /**
     */
    private String code;

    /**
     */
    @NotNull
    private String name;

    /**
     */
    @NotNull
    private String nr;

    /**
     */
    private String prefix;

    /**
     */
    private String suffix;

    /**
     */
    private String suiteNumber;

    /**
     */
    private String type;

    /**
     */
    private Boolean withinTownLimits;
}
