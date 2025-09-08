package example.cashcard;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cash_card")
public record CashCard(@Id Long id, Double amount){
    
}
