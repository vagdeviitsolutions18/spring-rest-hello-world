package com.vagdeviit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
  
    @PersistenceContext
    private EntityManager em;
  
    public String customFindMethod(String tableName) {
       Query query = em.createNativeQuery("select id from "+tableName+" where username = chinna");
      return "";
    }
}
