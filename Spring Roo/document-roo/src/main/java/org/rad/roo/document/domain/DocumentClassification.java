package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class DocumentClassification {

    /**
     */
    @NotNull
    private String classId;

    /**
     */
    @NotNull
    private String className;

    /**
     */
    @NotNull
    private String classificationSystem;
}
