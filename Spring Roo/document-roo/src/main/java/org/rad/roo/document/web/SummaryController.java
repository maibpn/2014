package org.rad.roo.document.web;
import org.rad.roo.document.domain.Summary;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/summarys")
@Controller
@RooWebScaffold(path = "summarys", formBackingObject = Summary.class)
public class SummaryController {
}
