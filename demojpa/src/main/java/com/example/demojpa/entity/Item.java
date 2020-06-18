package com.example.demojpa.entity;


import javax.persistence.*;
/*
 * 
     * @ClassName: Item
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月18日
     *
 */
@Entity
@Table(name = "item")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column
    private String checked;

    @Column
    private  String description;

   /* @OneToMany(targetEntity = com.example.demojpa.entity.Items.class)
   private List Items;

    public List getItems() {
        return Items;
    }

    public void setItems(List items) {
        Items = items;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", checked=" + checked +
                ", description='" + description + '\'' +
                '}';
    }
}
