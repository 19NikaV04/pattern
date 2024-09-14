
public class Account implements Element {

    private Long sum;

    public Account(Long sum) {
        this.sum = sum;
    }

    @Override
    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}