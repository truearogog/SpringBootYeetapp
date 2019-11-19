package artyomstrelkov.yeetapp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class MyService {
    public String getFile()
    {
        File f = new File("D:\\ArtjomsStrelkovs\\yeetapp\\yeetapp\\src\\main\\resources\\blablabla");
        StringBuilder res = new StringBuilder("");

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while (br.ready()) {
                res.append(br.readLine() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString();
    }
}
