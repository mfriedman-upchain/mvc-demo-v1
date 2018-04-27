package com.upchain.controller;

import com.upchain.service.FileListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    private final FileListService fileListService;

    public DemoController(FileListService fileListService){
        this.fileListService = fileListService;
    }

    @GetMapping("/files")
    public String showAllFiles(Model model) {
        model.addAttribute("files", fileListService.getAll());
        return "files";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
