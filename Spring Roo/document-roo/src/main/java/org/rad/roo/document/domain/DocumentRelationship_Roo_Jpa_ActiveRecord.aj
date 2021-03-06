// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.rad.roo.document.domain.DocumentRelationship;
import org.springframework.transaction.annotation.Transactional;

privileged aspect DocumentRelationship_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager DocumentRelationship.entityManager;
    
    public static final List<String> DocumentRelationship.fieldNames4OrderClauseFilter = java.util.Arrays.asList("type", "description");
    
    public static final EntityManager DocumentRelationship.entityManager() {
        EntityManager em = new DocumentRelationship().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long DocumentRelationship.countDocumentRelationships() {
        return entityManager().createQuery("SELECT COUNT(o) FROM DocumentRelationship o", Long.class).getSingleResult();
    }
    
    public static List<DocumentRelationship> DocumentRelationship.findAllDocumentRelationships() {
        return entityManager().createQuery("SELECT o FROM DocumentRelationship o", DocumentRelationship.class).getResultList();
    }
    
    public static List<DocumentRelationship> DocumentRelationship.findAllDocumentRelationships(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM DocumentRelationship o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, DocumentRelationship.class).getResultList();
    }
    
    public static DocumentRelationship DocumentRelationship.findDocumentRelationship(Long id) {
        if (id == null) return null;
        return entityManager().find(DocumentRelationship.class, id);
    }
    
    public static List<DocumentRelationship> DocumentRelationship.findDocumentRelationshipEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM DocumentRelationship o", DocumentRelationship.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<DocumentRelationship> DocumentRelationship.findDocumentRelationshipEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM DocumentRelationship o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, DocumentRelationship.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void DocumentRelationship.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void DocumentRelationship.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            DocumentRelationship attached = DocumentRelationship.findDocumentRelationship(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void DocumentRelationship.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void DocumentRelationship.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public DocumentRelationship DocumentRelationship.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        DocumentRelationship merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
