package org.rad.roo.document.web;
import org.rad.roo.document.domain.DocumentId;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/documentids")
@Controller
@RooWebScaffold(path = "documentids", formBackingObject = DocumentId.class)
public class DocumentIdController {
}
