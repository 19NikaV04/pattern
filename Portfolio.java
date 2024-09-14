import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Portfolio implements Element {
    
    public List<Element> elements = new ArrayList<>();

    @Override
    public Long getSum() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        elements.forEach(iElement -> {
            result.set(result.get() + iElement.getSum());
        });

        return result.get();
    }

    public void add(Element element){
        elements.add(element);
    }
}
