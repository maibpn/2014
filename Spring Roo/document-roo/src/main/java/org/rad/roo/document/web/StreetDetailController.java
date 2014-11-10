package org.rad.roo.document.web;
import org.rad.roo.document.domain.StreetDetail;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/streetdetails")
@Controller
@RooWebScaffold(path = "streetdetails", formBackingObject = StreetDetail.class)
public class StreetDetailController {
}
