package com.restful.Controllers;
import com.restful.Flow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowRepository extends JpaRepository<Flow, Long> {
}
