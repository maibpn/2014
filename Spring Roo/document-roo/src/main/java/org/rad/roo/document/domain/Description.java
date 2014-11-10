package org.rad.roo.document.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Description {


    /**
     */
    private Integer numberOfPages;

	
	/**
     */
    private Integer size;

	/**
     */
    private String comment;

    /**
     */
    @OneToOne
    private Title title;

    /**
     */
    @OneToOne
    private Summary summary;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<KeyWord> keyword = new HashSet<KeyWord>();
}
