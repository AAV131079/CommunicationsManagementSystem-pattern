package com.example.CommunicationsManagement.entity;

import com.example.CommunicationsManagement.entity.handbook.BookingStatusTypeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "booking_id")
    private Long bookingId;
    @Column(nullable = false, name = "before_date")
    private Date beforeDate;
    @OneToOne
    @JoinColumn(nullable = false, name = "booking_status_type_id")
    private BookingStatusTypeEntity status;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "create_time")
    private Date createTime;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "update_time")
    private Date updateTime;

    public BookingEntity() {
    }
}