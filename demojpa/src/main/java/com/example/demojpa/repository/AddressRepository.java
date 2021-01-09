package com.example.demojpa.repository;

import com.example.demojpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 继承jpa
 */
public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query(value="select * from tbl_address  WHERE city=:city",nativeQuery = true)
    public Address getAddressByCity(@Param("city") String city);

    @Query(value="select * from tbl_address  WHERE city=?1 AND ID=?2",nativeQuery = true)
    public Address getAddressBycityID(@Param("city") String city ,@Param("id") Long id);
    @Modifying
    @Query(value="UPDATE tbl_address SET city=:city where id=:id",nativeQuery = true)
    public  void updateBbycity(@Param("city") String city ,@Param("id") Long id);
}
