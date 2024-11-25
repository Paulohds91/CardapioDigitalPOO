import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.MenuItem;
import com.example.repositorio.MenuItemRepository;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository repository;

    public List<MenuItem> findAll() {
        return repository.findAll();
    }

    public MenuItem save(MenuItem item) {
        return repository.save(item);
    }
}
