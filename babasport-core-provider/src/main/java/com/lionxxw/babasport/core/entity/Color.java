package com.lionxxw.babasport.core.entity;

public class Color {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_color.id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_color.name
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_color.parent_id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_color.is_display
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    private Boolean isDisplay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_color.id
     *
     * @return the value of bbs_color.id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_color.id
     *
     * @param id the value for bbs_color.id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_color.name
     *
     * @return the value of bbs_color.name
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_color.name
     *
     * @param name the value for bbs_color.name
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_color.parent_id
     *
     * @return the value of bbs_color.parent_id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_color.parent_id
     *
     * @param parentId the value for bbs_color.parent_id
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_color.is_display
     *
     * @return the value of bbs_color.is_display
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public Boolean getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_color.is_display
     *
     * @param isDisplay the value for bbs_color.is_display
     *
     * @mbggenerated Thu Jun 02 10:24:11 CST 2016
     */
    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }
}