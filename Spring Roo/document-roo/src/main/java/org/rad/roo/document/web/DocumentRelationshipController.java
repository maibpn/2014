package org.rad.roo.document.web;
import org.rad.roo.document.domain.DocumentRelationship;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/documentrelationships")
@Controller
@RooWebScaffold(path = "documentrelationships", formBackingObject = DocumentRelationship.class)
public class DocumentRelationshipController {
}
