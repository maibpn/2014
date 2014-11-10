package org.rad.roo.document.web;
import org.rad.roo.document.domain.DocumentClassification;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/documentclassifications")
@Controller
@RooWebScaffold(path = "documentclassifications", formBackingObject = DocumentClassification.class)
public class DocumentClassificationController {
}
