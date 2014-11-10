// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.web;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.rad.roo.document.domain.DocumentRelationship;
import org.rad.roo.document.domain.DocumentRelationshipType;
import org.rad.roo.document.web.DocumentRelationshipController;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect DocumentRelationshipController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String DocumentRelationshipController.create(@Valid DocumentRelationship documentRelationship, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, documentRelationship);
            return "documentrelationships/create";
        }
        uiModel.asMap().clear();
        documentRelationship.persist();
        return "redirect:/documentrelationships/" + encodeUrlPathSegment(documentRelationship.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String DocumentRelationshipController.createForm(Model uiModel) {
        populateEditForm(uiModel, new DocumentRelationship());
        return "documentrelationships/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String DocumentRelationshipController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("documentrelationship", DocumentRelationship.findDocumentRelationship(id));
        uiModel.addAttribute("itemId", id);
        return "documentrelationships/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String DocumentRelationshipController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("documentrelationships", DocumentRelationship.findDocumentRelationshipEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) DocumentRelationship.countDocumentRelationships() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("documentrelationships", DocumentRelationship.findAllDocumentRelationships(sortFieldName, sortOrder));
        }
        return "documentrelationships/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String DocumentRelationshipController.update(@Valid DocumentRelationship documentRelationship, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, documentRelationship);
            return "documentrelationships/update";
        }
        uiModel.asMap().clear();
        documentRelationship.merge();
        return "redirect:/documentrelationships/" + encodeUrlPathSegment(documentRelationship.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String DocumentRelationshipController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, DocumentRelationship.findDocumentRelationship(id));
        return "documentrelationships/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String DocumentRelationshipController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        DocumentRelationship documentRelationship = DocumentRelationship.findDocumentRelationship(id);
        documentRelationship.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/documentrelationships";
    }
    
    void DocumentRelationshipController.populateEditForm(Model uiModel, DocumentRelationship documentRelationship) {
        uiModel.addAttribute("documentRelationship", documentRelationship);
        uiModel.addAttribute("documentrelationshiptypes", Arrays.asList(DocumentRelationshipType.values()));
    }
    
    String DocumentRelationshipController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}