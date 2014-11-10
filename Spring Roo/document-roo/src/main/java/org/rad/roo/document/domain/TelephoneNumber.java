package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class TelephoneNumber {

    /**
     */
    @NotNull
    private String areaCode;

    /**
     */
    @NotNull
    private String cityCode;

    /**
     */
    @NotNull
    private String countryCode;

    /**
     */
    @NotNull
    private String extension;

    /**
     */
    @NotNull
    private String localNumber;
}
