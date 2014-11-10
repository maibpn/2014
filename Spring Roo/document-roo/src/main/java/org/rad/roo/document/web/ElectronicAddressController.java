package org.rad.roo.document.web;
import org.rad.roo.document.domain.ElectronicAddress;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/electronicaddresses")
@Controller
@RooWebScaffold(path = "electronicaddresses", formBackingObject = ElectronicAddress.class)
public class ElectronicAddressController {
}
