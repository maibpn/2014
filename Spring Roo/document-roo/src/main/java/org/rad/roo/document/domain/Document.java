package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Document {


    /**
     */
    @NotNull
    private String docid;
    /**
     */
    @NotNull
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DocumentId> documentId = new HashSet<DocumentId>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DocumentRevision> revisions = new HashSet<DocumentRevision>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DocumentClassification> classifications = new HashSet<DocumentClassification>();

    /**
     */
    @NotNull
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Description> description = new HashSet<Description>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DocumentRelationship> documents = new HashSet<DocumentRelationship>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DocumentRelationship> relations = new HashSet<DocumentRelationship>();

    /**
     */
    @ManyToOne
    private Person deliveredBy;
}
