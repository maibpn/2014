package org.rad.roo.document.web;
import org.rad.roo.document.domain.PostalAddress;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/postaladdresses")
@Controller
@RooWebScaffold(path = "postaladdresses", formBackingObject = PostalAddress.class)
public class PostalAddressController {
}
