package com.example.jpa.repository;

import com.example.jpa.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 
     * @ClassName: TagRepository
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
