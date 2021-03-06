// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import java.util.Set;
import org.rad.roo.document.domain.Description;
import org.rad.roo.document.domain.Document;
import org.rad.roo.document.domain.DocumentClassification;
import org.rad.roo.document.domain.DocumentId;
import org.rad.roo.document.domain.DocumentRelationship;
import org.rad.roo.document.domain.DocumentRevision;
import org.rad.roo.document.domain.Person;

privileged aspect Document_Roo_JavaBean {
    
    public String Document.getDocid() {
        return this.docid;
    }
    
    public void Document.setDocid(String docid) {
        this.docid = docid;
    }
    
    public Set<DocumentId> Document.getDocumentId() {
        return this.documentId;
    }
    
    public void Document.setDocumentId(Set<DocumentId> documentId) {
        this.documentId = documentId;
    }
    
    public Set<DocumentRevision> Document.getRevisions() {
        return this.revisions;
    }
    
    public void Document.setRevisions(Set<DocumentRevision> revisions) {
        this.revisions = revisions;
    }
    
    public Set<DocumentClassification> Document.getClassifications() {
        return this.classifications;
    }
    
    public void Document.setClassifications(Set<DocumentClassification> classifications) {
        this.classifications = classifications;
    }
    
    public Set<Description> Document.getDescription() {
        return this.description;
    }
    
    public void Document.setDescription(Set<Description> description) {
        this.description = description;
    }
    
    public Set<DocumentRelationship> Document.getDocuments() {
        return this.documents;
    }
    
    public void Document.setDocuments(Set<DocumentRelationship> documents) {
        this.documents = documents;
    }
    
    public Set<DocumentRelationship> Document.getRelations() {
        return this.relations;
    }
    
    public void Document.setRelations(Set<DocumentRelationship> relations) {
        this.relations = relations;
    }
    
    public Person Document.getDeliveredBy() {
        return this.deliveredBy;
    }
    
    public void Document.setDeliveredBy(Person deliveredBy) {
        this.deliveredBy = deliveredBy;
    }
    
}
