package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class DocumentRelationship {

    /**
     */
    @Enumerated
    private DocumentRelationshipType type;

    /**
     */
    private String description;


}
