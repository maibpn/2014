package org.rad.roo.document.web;
import org.rad.roo.document.domain.KeyWord;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/keywords")
@Controller
@RooWebScaffold(path = "keywords", formBackingObject = KeyWord.class)
public class KeyWordController {
}
