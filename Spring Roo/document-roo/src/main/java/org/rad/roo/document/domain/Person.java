package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Person {

    /**
     */
    @NotNull
    private String id;

    /**
     */
    @Enumerated
    private Gender gender;

    /**
     */
    private String firstName;

    /**
     */
    private String mName;

    /**
     */
    private String lastName;

    /**
     */
    private String jobTitle;

    /**
     */
    private String prefix;

    /**
     */
    private String suffix;

    /**
     */
    @OneToOne
    private ElectronicAddress electronicAddress;

    /**
     */
    @OneToOne
    private TelephoneNumber mobilePhone;

    /**
     */
    @OneToOne
    private TelephoneNumber fax;

    /**
     */
    @OneToOne
    private TelephoneNumber landLinePhone;

    /**
     */
    @OneToOne
    private PostalAddress personalAddress;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Document> documents = new HashSet<Document>();

    
}
