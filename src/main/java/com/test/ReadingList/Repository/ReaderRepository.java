package com.test.ReadingList.Repository;

import com.test.ReadingList.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader,String> {
}
