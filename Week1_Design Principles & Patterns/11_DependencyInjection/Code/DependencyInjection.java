import java.util.*;
public interface CustomerRepository {
    String findCustomerById(String customerId);
}
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
        return "Customer[ID = " + customerId + ", Name = Ankita Singh]";
    }
}
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void getCustomerDetails(String customerId) {
        String details = customerRepository.findCustomerById(customerId);
        System.out.println(" Fetched Customer: " + details);
    }
}
public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.getCustomerDetails("C123");
    }
}
