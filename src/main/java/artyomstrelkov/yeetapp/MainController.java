package artyomstrelkov.yeetapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    final MyService fileService;

    public MainController(MyService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/file")
    public String GetFile()
    {
        return fileService.getFile();
    }

    @GetMapping("/hello")
    public String Hello()
    {
        return "Hello World!";
    }
}
