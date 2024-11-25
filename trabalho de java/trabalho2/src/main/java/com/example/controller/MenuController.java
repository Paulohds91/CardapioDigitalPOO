import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MenuItem;
import com.example.service.MenuItemService;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuItemService service;

    @GetMapping
    public List<MenuItem> getAllItems() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<MenuItem> addItem(@RequestBody MenuItem item) {
        MenuItem savedItem = service.save(item);
        return ResponseEntity.ok(savedItem);
    }
}
