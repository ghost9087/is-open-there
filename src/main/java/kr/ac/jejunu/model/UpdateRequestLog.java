package kr.ac.jejunu.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ghost9087 on 06/06/2017.
 */
@Entity
@Data
@Accessors(chain = true)
public class UpdateRequestLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean currentStatus;
    private Date requestedDate;
    @JoinColumn(name = "restaurant_id")
    @ManyToOne
    private Restaurant restaurant;
}
