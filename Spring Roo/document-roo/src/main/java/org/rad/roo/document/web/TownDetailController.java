package org.rad.roo.document.web;
import org.rad.roo.document.domain.TownDetail;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/towndetails")
@Controller
@RooWebScaffold(path = "towndetails", formBackingObject = TownDetail.class)
public class TownDetailController {
}
