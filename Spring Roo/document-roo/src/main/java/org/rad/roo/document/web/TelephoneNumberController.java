package org.rad.roo.document.web;
import org.rad.roo.document.domain.TelephoneNumber;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/telephonenumbers")
@Controller
@RooWebScaffold(path = "telephonenumbers", formBackingObject = TelephoneNumber.class)
public class TelephoneNumberController {
}
