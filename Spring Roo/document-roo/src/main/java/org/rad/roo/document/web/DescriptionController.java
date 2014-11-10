package org.rad.roo.document.web;
import org.rad.roo.document.domain.Description;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/descriptions")
@Controller
@RooWebScaffold(path = "descriptions", formBackingObject = Description.class)
public class DescriptionController {
}
