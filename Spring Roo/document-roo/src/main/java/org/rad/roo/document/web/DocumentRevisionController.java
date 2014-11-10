package org.rad.roo.document.web;
import org.rad.roo.document.domain.DocumentRevision;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/documentrevisions")
@Controller
@RooWebScaffold(path = "documentrevisions", formBackingObject = DocumentRevision.class)
public class DocumentRevisionController {
}
